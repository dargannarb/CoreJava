package oops;

import oppsExaplanation.InterFace_1;

public interface A extends InterFace_1 {

	public static void main(String[] args) {
		
		String str="gayathri";
		String str1="thulasi";
		
		str=str+str1;
		
		str1=str.substring(str1.length()+1);
		System.out.println(str1);
	}
	
}
