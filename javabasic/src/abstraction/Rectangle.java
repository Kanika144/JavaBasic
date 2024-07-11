package abstraction;

public class Rectangle extends Shape  {
	private float Width, height;
	
	public Rectangle() {
		this.Width = 5.0f;
		this.height = 2.0f;
	}
	public Rectangle(float Width, float height) {
	this.Width = Width;
	this.height = height;
	}
	@Override
	void calArea() {
		area=Width*height;
	}
	
}
