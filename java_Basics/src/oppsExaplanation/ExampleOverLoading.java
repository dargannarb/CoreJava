package oppsExaplanation;

public class ExampleOverLoading {

	public static void add() {
		System.out.println("no inputs");
	}

	public static void sub() {
		
	}
public static void sub(int a) {
		
	}
public static int sub(int a,int b) {
	return (a+b);
}
	
	
	 static int add(int a,String str) {
		System.out.println("output = " + a);
		return 0;
	}
	 
	 
	public static void add(int a, int b) {
		System.out.println("output = " + (a + b));
	}
	public static void main(String[] args) {
		int res=sub(2,1);
		System.out.println(res);
	}
	public static String add(long a, int b) {
		System.out.println("output = " + (a + b));
		String str="rrr";
		
		System.out.println(str.lastIndexOf("r"));;
		if((a + b) <= 10) {
			str="done";
		}else {
			str="not done";
		}
		
		return str;
		}

	public static void add(int b, long a) {
		System.out.println("output = " + (a + b));
	}

	public static void add(double a, int b) {
		System.out.println("output = " + (a + b));
	}

	public static void add(int a, int b, int c) {
		System.out.println("output = " + (a + b + c));
	}

	public static void add(int... a) {
		int total = 0;
		for (int x : a) {
			total += x;
		}
		System.out.println(total);

	}

	public static void add(long a, long l) {
		
	}

	

}
