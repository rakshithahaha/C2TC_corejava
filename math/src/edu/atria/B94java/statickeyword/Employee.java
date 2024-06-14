package edu.atria.B94java.statickeyword;

public class Employee {
	private int empID;  //instance variable
	private String empName;  
	
	private static String company="IBM";  //static variable
	public Employee(int empID , String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
		
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Employee.company = company;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + " company="+company+"]";
	}
	
	
}



	
