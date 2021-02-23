import java.util.*;
import java.io.*;
public class MovieDatabase {
private GenL<Movie> movies;
public String filename = "./Movies.txt";
public static final String DELIM = "\t";// your delim
	public MovieDatabase()
	{
		movies = new GenL<Movie>();//recreates your movie gen class
	}
	
	public void addMovie(Movie aMovie)
	{
		movies.insert(aMovie);
	}
	public void removeMovie(Movie aMovie) 
	{
		movies.gotoItem(aMovie);//goes to the node and then deltes it
		movies.removeAtCurr();
	}
	public int[] searchRating(int rating) { //creates an array to store the info
	    int[] listofmovies = new int[movies.length]; //initilizes the array at the object movie
	    movies.reset();//resets at head 
	    int i = 0; //creates counter for each time 
	    while(movies.getCurrentNode().link != null){//makes sure the node is not empty 
	        
	        if(movies.getCurrent().getRating() == rating) { 
	            listofmovies[i] = movies.getCurrent().getRating(); //gets the info to store
	            i++; 
	        }
	    } 

	    return listofmovies;//returns the list you made for them
	}
	public String[] searchName(String name)
	{
		String[] listofmovies = new String[movies.length];
		movies.reset();
		int i =0;
		while(movies.getCurrentNode().link !=null) {
			if(movies.getCurrent().getName() == name) {
				listofmovies[i] = movies.getCurrent().getName();
				i++;
			}
		}
		return listofmovies;
	}
	public String[] searchDirector(String director)
	{
		String[] listofmovies = new String[movies.length];
		movies.reset();
		int i =0;
		while(movies.getCurrentNode().link !=null) {
			if(movies.getCurrent().getDirector() == director) {
				listofmovies[i] = movies.getCurrent().getDirector();
				i++;
			}
		}
		return listofmovies;
	}
	public int[] searchYear(int year) { 
	    int[] listofmovies = new int[movies.length]; 
	    movies.reset(); 
	    int i = 0; 
	    while(movies.getCurrentNode().link != null){ 
	        
	        if(movies.getCurrent().getYear() == year) { 
	            listofmovies[i] = movies.getCurrent().getYear(); 
	            i++; 
	        }
	    } 

	    return listofmovies;
	}
	public double[] searchGross(double gross) { 
	    double[] listofmovies = new double[movies.length]; 
	    movies.reset(); 
	    int i = 0; 
	    while(movies.getCurrentNode().link != null){ 
	        
	        if(movies.getCurrent().getGross() == gross) { 
	            listofmovies[i] = movies.getCurrent().getGross(); 
	            i++; 
	        }
	    } 

	    return listofmovies;
	}
	
		
	public void writetoFile()//writes to file
	{
		try 
		{
			PrintWriter writer = new PrintWriter(new FileOutputStream(DELIM,false));
			writer.println(movies.getCurrent().toString());
			movies.gotoNext();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void readFromFile(String fileName)//reads from files
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELIM);
				if(splitLine.length != 4)
					continue;
				this.addMovie(new Movie(splitLine[0], splitLine[1],Integer.parseInt(splitLine[2]),Integer.parseInt(splitLine[3]),Double.parseDouble(splitLine[4])));
			}//splits the line by what the type is 
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
