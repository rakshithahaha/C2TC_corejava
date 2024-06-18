package edu.atria.oops.abstraction;

public class Square extends Shape {
	int side;

	public Square(int side) {
		super();
		this.side = side;
	}
	
	@Override
	public float calculateArea() {
		return area =side*side;
	}
	
}
