package oppsExaplanation;

public class BhimlaNayak extends AbsClass {
	BhimlaNayak() {
		super(10, 80);
	}

	public BhimlaNayak(int x) {
		super(10, 80);
	}

	public static void main(String[] args) {
		BhimlaNayak B = new BhimlaNayak(1);
		Movie m = new Movie();
		m.setRating(5.0);
		System.out.println(m.getRating());
		m.setMovieCollection(100000);
		System.out.println(m.getMovieCollection());
	}

	@Override
	public void A1() {
		// TODO Auto-generated method stub

	}

	@Override
	void B1() {
		// TODO Auto-generated method stub

	}

	@Override
	public long A11() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String B11() {
		// TODO Auto-generated method stub
		return null;
	}
}
