package Basics;

public class Operators {
	/*Operators
	 * 
	 *1.Arithmetic 
	 *2.Assigning
	 *3.Comparison
	 *4.Logical
	 *5.increment/Decrement
	 *6.Ternary operator
	 *
	
	 * 
	 */
	public static void main(String[] args) {
		// Assigning  = , +=  ,-=  ,/=  , %= ,*=
		
		int i = 10;
		    i+=20; // i=i+20;
		    i-=30;//0
		    i/=2;
		    i=100;
		    i*=3;
		    i/=5;
		    System.out.println(i);
		    i%=5;
		System.out.println(i);
		
		
		// Arithmetic   +,-,/,*,%
		
		i=50;
		int x=90;
		x = x+i;
		int a=90;
		double d=50;
	 double d1=  a+d;// 140.0
	 
	 String fname="kranthi";
	 String lname="reddy";
	 
	 String fullName= fname + lname;
	 System.out.println(fullName);
	 
	 
	 
	 
	 
	 
	 
	 
	 // every number in java with out decimal point should be  int type 
	// every number in java with  decimal point should be  double type 
	 
	 byte b=30;// 30 -> int -> 32 bit , 8 bits

	 float f3=90;// 90 -> int -> 32 bit , 32 bit
	 
	 float f1=90.0f;// 90.0 -> double 64bit , 32 bit
	 
	 double d2=100.90;
	 
	 float f4=(float)d2;
	 
	 
	 // Comparison  ==    <=    >=    !=    condition
	 
	 
	int n=100;
	int m=100;
	 boolean bn = n==m;
	 
	 String j="tom";
	 String k=new String("tom");
	 System.out.println(j);
	 System.out.println(k);
	 
	 boolean bn1=j==k;// it will check address of two vars
	 
	 boolean bn2= j.equals(k);// it will check content of vars
	 
	 System.out.println(bn2);
	 
	 
	 
	 //Logical     &(and) , | (or) , ^ (xor)    conditions
	 
	 
	 
	    int hight=6;
	    int weight =50;
	    
	   int s1h=5;
	   int s1w=60;
	    
	 boolean bn6  = s1h >=hight ^  s1w <= weight;//
		
		System.out.println(bn6);
	 
	// Increment  post increment, pre increment 
		
		int num=0;
	     System.out.println(num++);// num=num+1;  0
	     //num=1
	     System.out.println(++num);// 1+1
		
	  // Decrement  post decrement, pre decrement 
	      num=0;
	     System.out.println(num--);// num=num+1;  0
	     System.out.println(--num);// -2
	}

}
