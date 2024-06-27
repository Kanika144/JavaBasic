package Day3;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setSid(101);
		s1.setSname("jk");
		s1.setCity("chennai");
		System.out.println(s1);
		
	    Student s2=new Student();
	    s2.setSid(102);
	    s2.setSname("jenni");
	    s2.setCity("korea");
	    System.out.println(s2);
	    
	    Student s3=new Student();
	    s3.setSid(103);
	    s3.setSname("taehyung");
	    s3.setCity("seoul");
	    System.out.println(s3);
	}

}
