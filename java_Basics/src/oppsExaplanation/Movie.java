package oppsExaplanation;

public class Movie {
	private  double movieRating;
	private  double movieCollection;
	private  int howManyTheators;
	
	public double getMovieCollection() {
		return movieCollection;
	}
	public void setMovieCollection(double movieCollection) {
		this.movieCollection = movieCollection;
	}
	public int getHowManyTheators() {
		return howManyTheators;
	}
	public void setHowManyTheators(int howManyTheators) {
		this.howManyTheators = howManyTheators;
	}
	public void setRating(double movieRating) {
		this.movieRating=movieRating;
	}
	public double getRating() {
		return movieRating;
	}
	
	public static void main(String[] args) {
		Movie M=new Movie();
		System.out.println(M.movieRating);
		System.out.println(M.movieCollection);
	}
}
