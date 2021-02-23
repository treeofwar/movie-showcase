
public class Movie {
	//ben duker
private String name, director;
private int year;
private int rating;
private double gross;
	public Movie()
	{
		this.name = "no name yet";
		this.year = 0;
		this.rating = 1;
		this.director = "no director yet";
		this.gross = 0.0;
	}
	public Movie(String aName,String aDirector,int aYear,int aRating,double aGross)
	{
		this.setName(aName);
		this.setDirector(aDirector);
		this.setYear(aYear);
		this.setRating(aRating);
		this.setGross(aGross);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 0)
		this.year = year;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		if(rating <= 5 && rating >= 1)
		this.rating = rating;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		if(gross >=0)
		this.gross = gross;
	}
	@Override
	public String toString() {//overrides the tostring class so its not overloaded
		return "Movie [name=" + name + ", director=" + director + ", year=" + year + ", rating=" + rating + ", gross="
				+ gross + "]";
	}
	public String compareTo(Movie aMovie)//compares two types and if its there return something if not it gets a 0
	{
		if(aMovie != null && aMovie.name !=null && aMovie.director != null && aMovie.rating != 0 && aMovie.year !=0 && aMovie.gross !=0)
		{
			return "there";
		}
		else
		{
			return "0";
		}
	}
	
	public boolean equals(Movie aMovie)
	{
	if(aMovie != null) {
		if(this.name.equalsIgnoreCase(aMovie.name)) {
			if(this.director.equalsIgnoreCase(aMovie.director)) {
				if(this.year == aMovie.year) {
					if(this.rating == aMovie.rating) {
						if(this.gross == aMovie.gross) {
							return true;
						}
					}
				}
			}
		}
	}
	return false;
	}
	
}
