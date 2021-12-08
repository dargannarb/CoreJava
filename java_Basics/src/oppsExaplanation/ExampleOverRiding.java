package oppsExaplanation;

public class ExampleOverRiding {

	/**
	 * Over riding happens in child class we r not able decrease method visibility
	 * but we can increase method visibiliuty method signature must be same while
	 * overriding return should be same as parent method
	 * 
	 * we r not able to override static methods
	 * 
	 */

	public static void bikeRiding() {
		System.out.println("bikeRiding");
	}

	public static void horseRiding() {
		System.out.println("horseRiding");
	}

	public void M1() {
		System.out.println("M1");
	}

	public void M2() {
		System.out.println("M2");

	}

	public void M3() {
		System.out.println("M3");
	}
}
