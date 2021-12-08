package Basics;

public class Variables {

	/*
	 * Declaration  must and should
	 * Intialaization must and should
	 * Usage
	 * 
	 * variables are 3 types
	 * 1.Local var
	 *      Declaration  
	 *      Intialaization 
	 *      Usage  this 3 above actions happend inside the method
	 *      for local variable Intialaization must and should with out init we r not able use
	 *      for local vars we r not able to use static keyword and all accessmodefiers also not allowed
	 *      Only final key word is allowed
	 *      
	 * 2.Globel var
	 *      Declaration it should happend in ouside the methods and inside the class
	 *      Intialaization it happends at anywhere 
	 *      Usage it happends at anywhere 
	 *      With out Intialaization we can use the globel var at any where 
	 *      for this var static and all accessmodefiers (public , private , default, protected) and final also allow
	 *      
	 * 
	 * 3.static var
	 * 
	 * 
	 */
	
	
     protected static boolean x;     // for all globel vars default values are there   Integers = 0 , floating point type= 0.0, char = ' ' ; boolean = false;
	
	
	
	public static void main(String[] args) {
		x=true;
		System.out.println(x); 
	}
	
	public static void M1() {
		final int i;
		i=80;
		
		System.out.println(i);
	}
	
	
    public static void M2() {
    	final int i;
		i=80;
		
		System.out.println(i);
    }
}

