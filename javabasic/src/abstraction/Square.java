package abstraction;

public class Square extends Shape {
	private float Side;
	public Square()
	{
		Side =2.0f;
	}
	public Square(float Side)
	{
		this.Side=Side;
	}
	@Override
	void calArea() {
		super.area=Side*Side;
	}
	

}
