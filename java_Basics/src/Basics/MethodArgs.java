package Basics;

import java.util.Arrays;

public class MethodArgs {

// method args 
// commond line args
// var args methods
	public static void main(String[] args) {
		//Test.main(args);
		/*
		 * //varArgMethod(1, 23, 4, 5, 6, 6, 7);// ? int [] x= {1,2,3};
		 * 
		 * long [] y= {1,2,3}; long [] y1= {1,2,3,4,5,6,7,7,7,7,7};
		 * 
		 * int s=10; long r=s; Object[] rs= {1,2,3,4,5,6,7,7,7,7,7,"f",'d',100.0,true};
		 * 
		 * multi(rs);
		 */
	}
	
	
	
	public static void multi(Object[] a) {
		System.out.println(a.length);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void varArgMethod(int... numbers) {// int []

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//////////////////////////////////////////////////
		int total=0;
		for( int num:numbers) {
			total+=num;
		}
		System.out.println(total);
		
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void sum(int a, int b, double c, String str, boolean bn) {
		System.out.println(a + b + c);
	}

	String s;// null
	String[] s1;// []

	 protected static void sub() {
		int a = 300;
		int b = 200;
		System.out.println(a - b);
	}

	

	public static void div() {
		int a = 300;
		int b = 200;
		System.out.println(a / b);
	}

}
