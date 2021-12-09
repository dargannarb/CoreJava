package Collections;

import java.util.ArrayList;

import Basics.MainClass.publicClass2;
import Basics.MainClass.publicClass3;
import Basics.Variables;

public class CollectionList  extends Variables{

	static int t = 10;// 100
	
	void balayya() {
		System.out.println(Variables.x);
		
		
		publicClass3.nestedmain1(null);
		publicClass2.nestedmain1(null);

		publicClass2 p = new publicClass2();

	}

	 final  public static void main1(String[] yrefiwpuhoejip) {
		
		String str="";
		boolean bn=Boolean.parseBoolean(str);
		System.out.println(bn+" jjj");
		
		Object [] x= new Object[2];// null -- 99
		x[0]=10;
		x[1]=20;
		System.out.println(x + " ------");
		
	for(Object obj:x) {//NullPointerExceptions
		if((int)obj==20) {
			System.out.println(true);
		}
	}
	
	ArrayList A=new ArrayList();// on top of datastructures
	
	
	A.add(10);
	A.add(20);
	A.add("nfjiej");
	A.add(8.8);
	A.add("");
	A.add("s");
	A.add("df");
	A.add(10);
	A.add(20);
	
	System.out.println(A.contains(21));;
	System.out.println(A.remove(8.9));;
		
	}

	public int x = 10;
	static int y = 100;

	public static void NTR() {
		CollectionList c = new CollectionList();
		c.sudheer = "vishnu";
		pradeep();
	}

	private static void pradeep() {

	}

	private void ancorRavi() {
		pradeep();
	}

	private String sudheer = "reshmi";
	private static String adhi = "deepika";

	private class SIVA {

	}

	
	public static void main(String[] args) {
		     //     0123456789123
		String atr="i am good boy";
		System.out.println(atr.length());//0-13   0-12
		for(int i=0;i<=atr.toCharArray().length;i++) {
			System.out.println(atr.charAt(i));
		}
		
		
		
		
		
		
		
	//	System.out.println(Integer.parseInt(atr));
		
		
		
		ArrayList A=new ArrayList();// on top of datastructures
		A.add(10);
		A.add(20);
		A.add("nfjiej");
		A.add(8.8);
		A.add("");
		A.add("s");
		A.add("df");
		A.add(10);
		A.add(20);
		System.out.println(A.size());
		
		try {
			System.out.println(A.get(10));
		} catch (IndexOutOfBoundsException e) {
			System.out.println(A.size()-1);
			e.printStackTrace();
		}
		
		
		int [] a= {1,3,5,6,7,78};
		
		System.out.println(a.length);
		
		try {
			System.out.println(a[8]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("eifujopkvfej");
		
		
		
	}
}
