package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	// linkedlist is child of List, Queue both interfaces

	public static void main(String[] args) {
		List LL3 = new LinkedList();
		LinkedList LL = new LinkedList();
		LL.add("STR");// 0
		ArrayList<Integer> I = new ArrayList<>(LL);
		I.add(100);// 1
		I.add(1998897656);// 2
		I.add(123);// 3
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(2, 3);
		LinkedList LL2 = new LinkedList();
		LL2.add(100);
		LL2.add(100);
		LL2.addAll(I);
		LL2.add(I);
		System.out.println(LL2);
		LL2.addFirst(123445);
		LL2.addLast(12222223);
		LL2.removeFirst();
		LL2.removeLast();
		System.out.println(LL2.getFirst());
		;
		System.out.println(LL2.getLast());
		;
		System.out.println(LL2);
		LL2.clone();

	}
}
