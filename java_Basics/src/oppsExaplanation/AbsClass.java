package oppsExaplanation;

abstract class AbsClass {
	/** the claas defines with abstract key word
		we are not able to create instance for abstract class.. -> it is same as interface
		this class can accept all type of methods like abstract and concreet methods
		// abs method 
		 * concreet 
		 * asb & concreet methods
		 * 
		 *
		 for abstract class only public and default access modifiers are permitted
	     final key word is not allowed for abs classes
	*/
	
	public AbsClass() {
		System.out.println("i am const");
	}
	
	public AbsClass(int x) {
		System.out.println("i am const " +x);
	}
	public AbsClass(int x,int y) {
		System.out.println("i am const " +(x+y));
	}
	
	
	
	
	
	public static void main(String[] args) {

	}
	
	abstract public void A1();

	abstract void B1();
	
	abstract public long A11();

	abstract String B11();
	
	
	
	
	public static void A() {
	     Gent G=new Gent();
		}

		public void a() {

		}

		private static void B() {

		}

		private void b() {

		}

		static void C() {

		}

		void c() {

		}

		protected static void D() {

		}

		protected void d() {

		}
		
		
		
		
		public static int NA() {
			return 0;

		}

		public int na() {
			return 0;
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

		int nc() {
			return 0;
		}

		protected static int ND() {
			return 0;
		}

		protected int nd() {
			return 0;
		}
	
}
