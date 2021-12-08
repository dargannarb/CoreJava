package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HASH_SET {

	public static void main(String[] args) {
		Collection h2 = new HashSet();
		Set h1 = new HashSet();
		HashSet h = new HashSet();
		

//		h.add("Shiva");
//		h.add("RZZZZZZZZ");
//		h.add("Malli");
//		h.add("Venky");
//		h.add("Thulsi");

		h.add(2);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(7777);
		h.add(9);
		h.add(8);
		h.add(10);
		h.add(-1);

		System.out.println(h);//
		
		LinkedHashSet L=new LinkedHashSet<>();
		L.add(2);
		L.add(4);
		L.add(5);
		L.add(2);
		L.add(7777);
		L.add(9);
		L.add(8);
		L.add(10);
		L.add(-1);
		L.add(null);
		L.add(null);
		L.add(null);
		System.out.println(L);//
		
		SortedSet s=new TreeSet<>();
		s.add(2);
		s.add(4);
		s.add(5);
		s.add(2);
		s.add(7777);
		s.add(9);
		s.add(8);
		s.add(10);
		s.add(-1);
		System.out.println(Collections.reverseOrder());
		
		
		
		
		
	}

}
