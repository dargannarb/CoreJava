package Basics;

public class MainClass { // public , default , final , abstract

	// all access modifiers are allow , static , final, abstract

	// static -> we can call directly in outer classes

	public void M() {
		publicClass2 p= new publicClass2();
		publicClass2.nestedmain1(null);
		publicClass2.nestedmain1(null);
		p.nestedmain(null);
		publicClass3.nestedmain1(null);
		
	}
	
	public static void M1() {
		publicClass2 p= new publicClass2();
		publicClass2.nestedmain1(null);
		publicClass2.nestedmain1(null);
		p.nestedmain(null);
		publicClass3.nestedmain1(null);
		
		MainClass m4=new MainClass();
		publicClass3 p1=m4.new publicClass3();
		
		p1.nestedmain(null);
	}
	
	public static class publicClass2 {
		public void nestedmain(String[] args) {
			System.out.println("hello world");
		}
		public static void nestedmain1(String[] args) {
			System.out.println("hello world");
		}
	}

	
	public class publicClass3 {
		public void nestedmain(String[] args) {
			System.out.println("hello world");
		}
		public static void nestedmain1(String[] args) {
			System.out.println("hello world");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private class privateClass {

		public void M() {
			publicClass3 p = new publicClass3();

		}
	}

	abstract class defaultClass {

	}

	protected class ProtectedClass {

	}

}
