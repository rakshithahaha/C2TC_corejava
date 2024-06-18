package corejava;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation of scanner class
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the employee details"); int id=sc.nextInt(); String
		 * name=sc.next(); double salary=sc.nextDouble(); String designation=sc.next();
		 */

		/*
		 * eOne.setId(id); eOne.setName(name); eOne.setSalary(salary);
		 * eOne.setDesignation(designation);
		 * 
		 * System.out.println("Printing the employee Id: "+eOne.getId());
		 * System.out.println("Printing the employee name: "+eOne.getName());
		 * System.out.println("Printing the employee salary: "+eOne.getSalary());
		 * System.out.println("Printing the employee designation: "+eOne.getDesignation(
		 * ));
		 */

		// calling of default constructor
		// className objName=new className();
		/*
		 * p1 eOne = new p1(); System.out.println(eOne);
		 */

		// calling of parameterized constructor
		Employee eTwo =new Employee(111,"Rohith",50000.00,"Tester");
		System.out.println(eTwo);
	}

}
