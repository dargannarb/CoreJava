package oppsExaplanation;

public interface InterFace_1 {

	
	// only static methods with public,private, default but for private it is accept non-static as well (eeeee method valla no use)
	// for interface we r not able to create instance
	
	// methods , classes two types 
	// 1 . concreet method  // which method have a body it is concreet method
	// 2. abstract method // which method don't have body it is abstract method // public and default // static kye word is not allowed for asb methods
	
	  int a=10; // final public static
	  String str="anc";
	
	 public void A1();

	 void B1();
	
	 public long A11();

	 String B11();
	
	public static void A() {

	}

	private static void B() {
		B();
	}

	private void b() {

	}

	static void C() {

	}
	
	public static String NA() {
		return null;

	}

	private static int NB() {
		return 0;
	}

	private int nb() {
		return 0;
	}

	static int NC() {
		return 0;
	}

	

	
	
	
}
