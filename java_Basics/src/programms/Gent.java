package programms;

import java.util.Arrays;
import java.util.HashMap;

public class Gent{

	public static void main(String[] args) {
		String []str= {"AA","10","9000"};
		String []str1= {"BB","10","9000"};
		HashMap<String[],String> DATA=new HashMap<>();
		DATA.put(str, "Proj1");
		DATA.put(str1, "Proj1");
		
		for(Object[] obj:DATA.keySet()) {
			System.out.print(DATA.get(obj));
			System.out.print(" - ");
			System.out.print(Arrays.toString(obj));
			System.out.println();
		}
		
		
		/*
		 * HashMap<String, HashMap<String,HashMap<Integer, Double>>> Data = new
		 * HashMap<>(); HashMap<Integer, Double> Emp1SalAndExe=new HashMap<>();
		 * Emp1SalAndExe.put(12, 90000.0); HashMap<String,HashMap<Integer, Double>>
		 * Emp1NameTech=new HashMap<>(); Emp1NameTech.put("A", Emp1SalAndExe);
		 * Data.put("Project1", Emp1NameTech);
		 * 
		 * 
		 * for(Object obj:Data.keySet()) { System.out.println(obj);
		 * HashMap<String,HashMap<Integer, Double>> secodLevel=Data.get(obj); for(Object
		 * obj2:secodLevel.keySet()) { System.out.println(obj2); HashMap<Integer,
		 * Double> ThirdLevel=secodLevel.get(obj2); for(Object obj3:
		 * ThirdLevel.keySet()){ System.out.println(obj3);
		 * System.out.println(ThirdLevel.get(obj3)); } } }
		 */
		
		
	}

	
	
}
