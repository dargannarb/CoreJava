package Basics;

public class TestClass {

	public static void main(String[] args) {
		
		
		String str="java";
		int [] a= {10,9,8,7,6,5,4,3,2,1};
		String rev="";
		for(char st:str.toCharArray()) {//  back word traverse
			rev=st+"\n"+rev;
		}
		System.out.println(rev);// 10  9  8  7
		
		for(int i=str.length()-1;i>=0;i--) {// 
			System.out.println(str.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		int num1 = 0;// 2
		int num2 = 1;// 2
		int num3 = 0;// 5
		// 0 1 1 2 3 5 6 7
		for (int i = 0; i < 10; i++) {// i=2
			// System.out.println(num1);//3
			num3 = num1 + num2;// 2+3=5 - num3
			num1 = num2;// 3
			num2 = num3;// 5
		}

		int inuput = 10;
		num1 = 0;
		num2 = 1;
		num3 = 0;
		while (inuput > 0) {// true
			// System.out.println(num1 +" --");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			inuput--;
		}
		
		boolean f=true;
		f=false;
		while (f) {// true variable    
			System.out.println("x is less than 0");
		}
		int xi = 8;
		f=false;
		do {
			//System.out.println("x is less than 0");
			xi--;
		} while (f);
        int y=10;
	}
	

	public static void arrprogram() {
		// 1,2,3 g, a, ya, 3, 1 2 1
		// 123gaya3

		Object[] ml = { 1, 2, 3, 'g', 6, 6, 6, 6, 6, 6, 87, 7, 7, 74, 4, 8, 4, 1, true, false, 4, 4, 8, 4, 4, 1, 4, 4,
				6, 66, '%', '&', 7, 7, 77, 7, 7, 6, 6, 6, 'a', "ya", 3, 1, 2, 1 };
		String str = "";
		for (Object str1 : ml) {
			if (Boolean.parseBoolean(str1.toString()) == true | Boolean.parseBoolean(str1.toString()) == false) {

			} else {
				str = str + str1;
			}

			if (str.endsWith("a3")) {
				break;
			}
		}
		str = str.replaceAll("[4-9!@#$%^&*]", "");

		System.out.println(str);

		str = "";

		for (int i = 0; i < ml.length; i++) {

			str = str + ml[i];
			if (str.endsWith("a3")) {
				break;
			}

		}

		str = str.replaceAll("[4-9%&!@#^*]", "");
		System.out.println(str);

	}

	/*
	 * 
	 * 
	 ** 
	 ** 
	 * 
	 * * * * *
	 * 
	 * 
	 * 
	 * * * * * * * * * * * * * * * * * * * * * *
	 **
	 ***
	 ****
	 *****
	 ******
	 *
	 * 
	 **
	 ***
	 ****
	 *****
	 ******
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
