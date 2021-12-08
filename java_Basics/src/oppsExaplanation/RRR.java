package oppsExaplanation;

public class RRR extends BhimlaNayak{
	
	
	
	public RRR() {
		super(10);
	}
	
	
	/*
	 * public void A(int x) { B(x); C(x); } public void B(int y) {
	 * System.out.println(y); }
	 * 
	 * public void C(int z) { System.out.println(z); }
	 */
	public static void main(String[] args) {// null
		BhimlaNayak B=new BhimlaNayak();
		  Movie m = new Movie();
		  m.setRating(4.5); 
		  System.out.println(m.getRating());
		  m.setMovieCollection(100000);
		  System.out.println(m.getMovieCollection());
		  BhimlaNayak.main(args);
	}
}
