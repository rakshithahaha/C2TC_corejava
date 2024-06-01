package edu.atria.math.secondpackage;

import edu.atria.math.firstpackage.Base;

public class ExecutorTwo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bTwo = new Base();
		//private members are not accessible outside the package 
		//System.out.println(bTwo.variablePrivate);
		
		//Default members are not accessible outside the package
		//System.out.println(bTwo.variableDefault);
		
		ExecutorTwo ex = new ExecutorTwo();
		System.out.println(ex.variableProtected);
		
		System.out.println(bTwo.variablePublic);

	}

}
