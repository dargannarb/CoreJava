package Basics;

public class KeyWords {

	// void  //  return 
	//              information
	// statement -> malli -- work -- > return   yes/no  non void method should return something depends on ur req...
	// statement -> malli --- work -->      void does'nt return anything
	
	
	
	public static void voidMethod(int aaa, int b) {
		int c=aaa+b;
	}
	
	public static char malli() {// 
		
		return 0;
	}
	
	
	
	public static int nonVoidMethod(int a , short b) {// data type  
	    int c=a+b;
		return c;
	}
	
	public static String nonVoidMethod1(String str, String str1) {// data type  
		String c=str+str1;
		return c;
	}
	public static String nonVoidMethod2() {// data type  
		String c="i love my india";
		return c;
	}
	
	public static void main(String[] args) {
		 voidMethod(100, 200);
		 String str = nonVoidMethod1("india is ", "my country");
		 System.out.println(str);
		 
		 char ch=str.charAt(7);
		 System.out.println(ch);
		 
		 str.isEmpty();
		 str.repeat(100);
		 int value=str.indexOf('z');        //exception// error // -1    0 - + 999999
		 System.out.println(value);
		 
		      nonVoidMethod(10, (short)10);		 
	}
	/*
	 * 
	 * 
	 * Type casting - 
	 * String methods
	 * 
	 * for -- complex / for - each/ 
	 * if -- complex 
	 * 
	 * operators
	 * static
	 * void / return
	 * accessmodifiers
	 * method colling
	 * Object/Instance
	 * types of variables
	 * 
	 * Arrays 
	 * method argument
	 * cmd args
	 * var arg methods
	 * 
	 * 
	 * final-- vars
	 * this
	 * 
	 * 
	 * main method -->
	 * 
	 * constructor -- > two 
	 * 
	 * while, do while , switch
	 * 
	 * 
	 * exceptions --> StrngIndexOutOfBoundsExcception / ArrayIndexOutOfBoundsExcception / numberFormatException
	 * 
	 * 
	 * 
	 * 10 -- 
	 * 
	 * 
	 * 
	 * classes
	 * methods
	 * Interface 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
}
