package daynine;

public class SampleStringDemo {

	public static void main(String[] args) {
		
		char c[] = {'I','n','d','i','a'};
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		String longStr ="This is to show"+"how string concatination"+"can happen with additional"
                         +"operator.";
		
		System.out.println(longStr);
	}

}
