package abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
	   Square Sq = new Square();
	   Rectangle r1 = new Rectangle();
	   Sq.calArea();
	   Sq.show();
	   r1.calArea();
	   r1.show();
	   
	   System.out.println("---------");
	   
	   Shape shape;
	   shape = new Square(12.5f);
	   
	   shape.calArea();
	   shape.show();
	   
	   shape = new Rectangle(10,20);
	   
	   shape.calArea();
	   shape.show();

	}

}
