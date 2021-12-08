package oppsExaplanation;

import oops.Abstraction;

public class ExampleOverLoading {
	/**
	 * 
	 * over loading happens with in same class // while doing overloading method
	 * name should be same and arguments should be uniq , different data types ,
	 * number of args , placement of args // in overloading we can increase or
	 * decrease method visibility and we can change return type of method depends on
	 * u r req -- (void/non void)
	 * 
	 */

	public static void add() {
		System.out.println("no inputs");
	}

	private static void sub() {

	}

	public static void sub(int a) {

	}

	public static int sub(int a, int b) {
		return (a + b);
	}

	static int add(int a, String str) {
		System.out.println("output = " + a);
		return 0;
	}

	public static void add(int a, int b) {
		System.out.println("output = " + (a + b));
	}

	public static void main(String[] args) {
	}

	public static String add(long a, int b) {
		System.out.println("output = " + (a + b));
		String str = "rrr";

		System.out.println(str.lastIndexOf("r"));
		;
		if ((a + b) <= 10) {
			str = "done";
		} else {
			str = "not done";
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

	/*
	 * public static void add(int... a) { int total = 0; for (int x : a) { total +=
	 * x; } System.out.println(total);
	 * 
	 * }
	 */
	public static void add(long a, long l) {

	}

}
