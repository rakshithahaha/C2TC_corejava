package edu.atria.B94java.inheritance;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen eTwo = new Employee(396788999936l,13452920l,"Indian",111,"Ravi","Tester",50000.00);
		System.out.println(eTwo);
		
		//Hierarchical inheritance
		Citizen sOne = new Student (12456783909l,1233214649l,"Indian",101,"Rohith","CSE","Rahul");
		System.out.println(sOne);

	}

}
