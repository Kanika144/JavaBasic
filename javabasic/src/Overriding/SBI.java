package Overriding;

public class SBI  extends RBI{

	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
    public SBI getOject() {
    	return this;
    }
	
}
