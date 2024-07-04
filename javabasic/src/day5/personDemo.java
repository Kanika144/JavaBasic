package day5;

public class personDemo {

	public static void main(String[] args) {
		person p1 = new person();
		p1.setName("jisoo");
		p1.setIncome(10000);
		p1.setGender("female");
		p1.setAge(25);
		p1.setTax(50);
		System.out.println(p1);
		
		person p2 = new person();
		p2.setName("Jk");
		p2.setIncome(20000);
		p2.setGender("male");
		p2.setAge(23);
		p2.setTax(25);
		System.out.println(p2);
		

	}

}
