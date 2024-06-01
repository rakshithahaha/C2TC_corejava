package edu.atria.math.firstpackage;

public class ExecutorOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne= new Base();
		//Private members are not visible outside the class
		//System.out.println(bOne.varPrivate);
		
		System.out.print(bOne.variableDefault);
		System.out.print(bOne.variableProtected);
		System.out.print(bOne.variablePublic);
		
	}

}
