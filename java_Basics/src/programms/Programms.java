package programms;

import java.util.Arrays;
import java.util.HashMap;

import oppsExaplanation.LivingObjects;

public class Programms {

	
 
  
	public  void main(String[] args) {
	// class 4 sections each have 10 mems  
		
	}
	
	public static void removeDuplicateCharsFromString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i != j) { 
					if ( str.charAt(i) == str.charAt(j)) {  
						count++;//1
					}
				}
			}
			if (count == 0) {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}

}