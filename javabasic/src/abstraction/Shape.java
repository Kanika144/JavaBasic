package abstraction;

public abstract class Shape {
	protected float area;
	
	abstract void calArea();
	
	void show()
	{
		System.out.println("Arae of Shape"+area);
	}

}
