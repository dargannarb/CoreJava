package programms;

import oppsExaplanation.LivingObjects;

public class Animals  extends LivingObjects{
	
	public static void main(String[] args) {
		LivingObjects.breath();
		LivingObjects.sense();
		LivingObjects L =new LivingObjects();
		L.livingSpace="";
		L.think();
		
		Animals A=new Animals();
		A.eat();
		
	}

}
