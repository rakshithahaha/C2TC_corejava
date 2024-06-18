package edu.atria.oops.abstraction;

public class AbstractClassMain {

	public static void main(String[] args) {
		//cannot instantiate abstract class shape
		//Shape s=new Shape(2.0f);
		
		Shape sOne=new Square(2);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo=new Rectangle(7,5.5f);
		sTwo.calculateArea();
		sTwo.display();
				

	}

}
