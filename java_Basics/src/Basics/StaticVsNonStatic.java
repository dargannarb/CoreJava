package Basics;

public class StaticVsNonStatic {
	int j = 11;// g g
	public static String str = "asm";// g g
	public static String str1;// g g
	
	static int value;
	
	  static void c() {
		//String str1="ggg";
		//str1 = "sss";
		//this.str1 = str1;
		String str;// g l
		str = "class";// g
		System.out.println(value);//
		System.out.println(str1);//null
	}

	// WAIT FOR FEW MINS
	public static void main(String[] args) {
		//System.out.println(i);// 12 //12
		System.out.println(str1);
		System.out.println();
		System.out.println(args[0]);
		 c();
		
       
	}

	int a = 10;// l g

	 static void a() {
		int j = 1;// l l
		j = 50;
		StaticVsNonStatic s = new StaticVsNonStatic();
		s.a = 30;
		int a = 13;// l l

	}

	public void b() {
		String str;// l l
		str = "class";// l
		str1 = "shiva";

	}

}
