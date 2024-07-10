package Exceptional;

public class Example {

	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=0;
		c=0;
		
		try
		{
			c=a/b;
			System.out.println("a="+a+"b="+b+"c="+c);
	    }
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured..");
			b=5;
			c=a/b;
			System.out.println("a="+a+"b="+b+"c="+c);
			
		}

	}

}
