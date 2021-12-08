package programms;

import java.util.Scanner;

public class Calsi extends Gent{
	// 2+3+5*7

public  void A() {
		System.out.println("ihjkioijkhvgj");
	}


	 class C{
		
		private  void A() {
			System.out.println("ihjkioijkhvgj");
		}
	}
	
static class D{
		
		public  void A() {
			System.out.println("ihjkioijkhvgj");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Calculator() {
		int output =0;
		boolean flag = true;
		while(flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter operation");
			String op = sc.next();
			switch (op) {
			case "+":
				System.out.println("enter num");
				int a = sc.nextInt();
				output = output+a;
				break;
			case "-":
				System.out.println("enter num");
				 a = sc.nextInt();
				 output = output-a;
				break;
			case "*":
				System.out.println("enter num");
				 a = sc.nextInt();
				 output = output*a;
				break;
			case "/":
				System.out.println("enter num");
				 a = sc.nextInt();
				 output = output/a;
				break;
			case "%":
				System.out.println("enter num");
				 a = sc.nextInt();
				 output = output%a;
				break;
			case "=":
				flag=false;
				break;
		
			}
		}
		
		System.out.println(output);
	}
}
