package programms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import oppsExaplanation.LivingObjects;

public class Programms {

	public static void main(String[] args) {
		DMart();
		
	}

	public static void DMart() {
		Scanner s = new Scanner(System.in);
		int totalbillBeforecoupon=0;
		boolean flag=true;
		String[] genders = { "male", "female", "kids" };
		System.out.println("plz select gender like if men enter M (L,K) ");
		switch (s.next().toUpperCase()) {
		case "M":
			String[] items = { "pants", "shirt", "T- shirt" };
			int[] itemsPrices = { 1700, 1400, 1300 };
			System.out.println("plz enter item type like P(pant),S(shirt),T(T-shirt)");
			switch (s.next().toUpperCase()) {
			case "P":
				totalbillBeforecoupon=totalbillBeforecoupon+itemsPrices[0];
				break;
			case "S":
				totalbillBeforecoupon=totalbillBeforecoupon+itemsPrices[1];
				break;
			case "T":
				totalbillBeforecoupon=totalbillBeforecoupon+itemsPrices[2];
				break;
			default:
				System.out.println("wrong input");
				break;
			}
			System.out.println("total bill Before coupon :- " + totalbillBeforecoupon);
			
			break;
		case "L":

			break;
		case "K":

			break;

		default:
			break;
		}

	}

	public static void removeDuplicateCharsFromString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i != j) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;// 1
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
