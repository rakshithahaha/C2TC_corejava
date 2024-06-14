package edu.atria.B94java.statickeyword;

public class MyClass {
	private int section;
	private static int srno;
	
	//static block 
	static {
		System.out.println("within the static block..");
		srno=1000;
	}
	MyClass(){
		System.out.println("within default contructor...");
		srno++;
	}
	
	//static method
	public static void display() {
		System.out.println(srno);
		
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + " ,srno="+ srno +"]";
	}
	

}
