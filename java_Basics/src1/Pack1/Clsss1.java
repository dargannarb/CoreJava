package Pack1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Clsss1 {

	public static void main(String[] args) {
		
		
		
		List<Integer> I =new ArrayList<>();// 4 
		
		ArrayList<String> S=new ArrayList<>();
		
		ArrayList<Double> D=new ArrayList<>();
		ArrayList<Boolean> B=new ArrayList<>();
		I.add(100);// int
		I.add(1998897656);
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(123);
		I.add(2,3);
		I.remove(3);
		
		
		Object[] s=I.toArray();
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		Collections.sort(I);
		System.out.println(I);
		Collections.reverse(I);
		System.out.println(I.toString());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * ArrayList A = new ArrayList();// all methods and implimentation comes from
		 * ArrayList Class // hetrogenious List A1 = new ArrayList(); // All methods are
		 * coming from List (I) and Implimentation from ArrayList class Collection A2 =
		 * new ArrayList();// All methods are coming from Collection (I) and
		 * Implementation from ArrayList // class
		 * 
		 * 
		 * 
		 * ArrayList Nalanda = new ArrayList(); ArrayList ZPH = new ArrayList();
		 * 
		 * Nalanda.add("Malli"); Nalanda.add("RB"); Nalanda.add("Venky");
		 * Nalanda.add("Shiva"); Nalanda.add("Sai");
		 * 
		 * 
		 * ZPH.add("Malli 1"); ZPH.add("RB 1"); ZPH.add("Venky 1"); ZPH.add("Shiva 1");
		 * ZPH.add("Sai 1"); ZPH.add("Venky"); ZPH.add("Malli"); ZPH.add("Shiva");
		 * ZPH.add("Sai"); ZPH.add("RB");
		 * 
		 * System.out.println(ZPH.containsAll(Nalanda));;
		 * System.out.println(ZPH.contains("sai"));;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * ArrayList SC = new ArrayList(Nalanda); for(Object obj:SC) {
		 * System.out.println(obj); }
		 * 
		 * for(int i=0;i<SC.size();i++) { System.out.println(SC.get(i));; }
		 * 
		 * 
		 * System.out.println(SC); System.out.println(SC.size());// 5-1 =4
		 * 
		 * ArrayList SC1 = new ArrayList(11);
		 * 
		 * System.out.println(SC1.size());
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		/*
		 * //[malli, shiva, venky,100, X, true, false, 100.1, 100.1, 100]
		 * 
		 * A.add(2, "Venkatesh"); //[malli, shiva,Venkatesh, venky,100, X, true, false,
		 * 100.1, 100.1, 100]
		 * 
		 * 
		 * A1.add("malli"); A1.add("shiva"); A1.add("venky"); A1.add("RB");
		 * 
		 * A.add(2, "Venkatesh"); //[malli, shiva,Venkatesh,Venkatesh, venky,100, X,
		 * true, false, 100.1, 100.1, 100] // A.remove(3);
		 * System.out.println(A.remove(5)); System.out.println(A);
		 * 
		 * ArrayList<Double> AL= new ArrayList<>(); // E means Type of elements
		 * AL.add(100.10);//0 AL.add(100.2);//1 AL.add(2,100.10);//
		 * 
		 * System.out.println(AL); //System.out.println(AL.get(100));
		 */	}

}
