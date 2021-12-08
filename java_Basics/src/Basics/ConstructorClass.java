package Basics;

public class ConstructorClass {
	/* its look like a method 
	// Constructor doesn't return anything   and it is not accept static keyword as well
	// it should be same as class name 
	 // All accessmodifiers this are accepted // static and voi
	  // 4 types
	   * default const // this is public 
	   * 0 args const
	   * single args
	   * multy args
	   * 
	   * each every class have default constructor
	   *  default constructor is not exist //  not able to see
	   * 
	   *  purpose of constructor  :- to create Instance of class // execute some block of code depends on args of new class instance or initiate global variable     
	   * with out constructor we are not able to create Instance of any class
	 * 
	 * 
	 * 
	 */

	public ConstructorClass(int x) {
			System.out.println("hi i am 0 args const");
			System.out.println("0 coupns");
		}
	public ConstructorClass(int x,int y) {
		System.out.println("hi i am 0 args const");
		System.out.println("1 coupans");
	}
	
	
	public ConstructorClass(int x,int y,int z) {
		System.out.println("hi i am 0 args const");
		if((x+y+z)>2400) {//2399 // 1
			System.out.println("2 coupans");//1000
		}else {
			System.out.println("1 coupns");
		}
	}
	
	public ConstructorClass(int x,int y,int z,int a) {
		System.out.println("hi i am 0 args const");
		System.out.println("3 coupans");
	}

}
