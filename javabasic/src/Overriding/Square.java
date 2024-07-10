package Overriding;

public class Square extends Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square with side"+ side);
	}

	@Override
	public void erase() {
	     System.out.println("Earsing a square with side"+side);
	}

	
}
