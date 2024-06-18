package edu.atria.oops.abstraction;


//An abstract class can contain both abstract and non abstract methods  
//even one abstract method exists , the class has to be abstract
public abstract class Shape {
	float area;
	//abstract method
	public abstract float calculateArea();
	
	
	//non abstract method
	public void display() {
		System.out.println("Area of the shape : " +area);
	}

}
