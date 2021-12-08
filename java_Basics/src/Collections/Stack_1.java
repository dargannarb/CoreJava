package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stack_1 {

	public static void main(String[] args) {

		// List Sc=new Stack();// methods - implimentation -stack

		// Vector Sc1=new Stack();//
		int[] x = new int[4];
		ArrayList<Integer> I = new ArrayList<>();
		I.add(100);// 1
		I.add(1998897656);// 2
		I.add(1234);// 3
		I.add(1235);
		I.add(1236);
		I.add(1237);
		I.add(1238);
		I.add(1239);
		Object[] a = { 1, 2, 3, 3 };

		Stack s = new Stack();//
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		// System.out.println(s.indexOf("Z"));
		// System.out.println(s.indexOf("B",2));

		// s.copyInto(a); // s.addElement(s);

		System.out.println(s.get(0));// latest
		System.out.println(s.elementAt(0));//
		
		// s.clear(); //s.addAll(I); s.addAll(2,I); s.add(2,9);
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		s.indexOf("3");// -1 System.out.println(s.indexOf(13, 3));
		System.out.println(s);

	}

}
