package Overriding;

public class ShapeDemo {

	public static void main(String[] args) {
		 
		Shape[] Shapes = new Shape[3];
		
		Shapes[0] = new Circle(5.0);
		Shapes[1] = new Triangle(4.0, 3.0);
		Shapes[2] = new Square(6.0);
        
		for (Shape Shape : Shapes) {
			Shape.draw();
			Shape.erase();
			System.out.println("----------------------");
		}
	}

}
