import java.util.*;
public class MovieDataBaseFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
MovieDatabase moviedatabase = new MovieDatabase();//creatse the database for it
boolean quit = false;
while(!quit)
{
	prints();//calls the method to print out the instructions
	int choice = keyboard.nextInt();
	String temp;
	int temp1;
	switch(choice)
	{
	case 1:
		System.out.println();
		System.out.println("enter the movie name,director,year,rating and box office gross");
		moviedatabase.addMovie(new Movie(keyboard.nextLine(),keyboard.nextLine(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextDouble()));
		break;
	case 2:
		System.out.println();
		System.out.println("enter a movie to remove");
		keyboard.hasNextLine();
		temp = keyboard.nextLine();
		moviedatabase.removeMovie(null);
		break;
	case 3:
		System.out.println();
		System.out.println("enter in a movie to search by name");
		keyboard.nextLine();
		temp = keyboard.nextLine();
		moviedatabase.searchName(temp);
		break;
	case 4:
		System.out.println();
		System.out.println("enter the movie director to search");
		keyboard.hasNextLine();
		temp = keyboard.nextLine();
		moviedatabase.searchDirector(temp);
		break;
	case 5:
		System.out.println();
		System.out.println("enter a movie year to search");
		keyboard.hasNextLine();
		temp1 = keyboard.nextInt();
		moviedatabase.searchYear(temp1);
		break;
	case 6:
		System.out.println();
		System.out.println("enter a movie rating 1-5 to search");
		keyboard.hasNextLine();
		temp1 = keyboard.nextInt();
		moviedatabase.searchRating(temp1);
		break;
	case 8:
		System.out.println();
		moviedatabase.writetoFile();
	case 9:
		System.out.println();
		moviedatabase.readFromFile(null);
	case 0:
		System.out.println("no thanks");
		quit = true;
		break;
		default:
			System.out.println("?");
	}
}
	}
	public static void prints()
	{
		System.out.println("enter 1 for add movie, 2 to remove remove, 3-6 to search based on name,director,rating,year,grossboxoffice, 7 to print all movies,8,print to file,9 to read, 0 to quit ");
	}
}
