package oops;

import oppsExaplanation.Animals;
import oppsExaplanation.Humans;
import oppsExaplanation.LivingObjects;

public class Inherentence {

	// to get from others   extends and  implements
	// reuse ability of code // flexibility  // parent - child 
	
	// two types ->  multilevel Inherentence ,   multiple Inherentence
	// Interface --> it is like a class
	// abstract
	
	/*
	 * 
	Mobile
	
	types - oneplus -- 7,7t,8,8t,9,9r,9pro 120 displ os 
	
	
	
	*/
	
	public static void main(String[] args) {
		// what is inheritance  //shiva
		
		// I interface , A class
		
		// A extends I { } parent A class   I inteface  child   
		
		// I implements A { }  I parent  A class
		
		// A implements I 
		
		// A  B C // A - 2 methods 1 s/ 1 ns  /pr s // pr ns
		
		// B extends A      //  C    B.   B s=new B(); s. 
		
		//pac1   cl   pr s   ////  pac2   cl2    main    cl2 s=new cl2();
		//pac1   cl   def s   ////  pac2   cl2    main
		
		
		
	}
	
	public static void malli() {
		Animals A=new Animals();
		A.breath();
		A.think();
		
		
	}
	 static void shiva() {
		Humans H=new Humans();
		H.breath();
	}
	
	 private static void thulsi() {
			Animals A=new Animals();
			A.breath();
			
			
		}
	 protected static void abhi() {
			Animals A=new Animals();
			A.breath();
			
			
		}
	 protected  void gayathri() {
			Animals A=new Animals();
			A.breath();
			
			
		}
}

