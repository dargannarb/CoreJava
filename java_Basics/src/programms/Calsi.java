package programms;

import java.util.Scanner;

public class Calsi {
	// 2+3+5*7

	public static void main(String[] args) {
		
		
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
