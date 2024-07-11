package Assignment;
import java.util.Scanner;

import Day3.Student;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int rollno;
		char grade;
		double Percentage;
		
		System.out.println("Enter the rollno");
		rollno=sc.nextInt();
		
		System.out.println("Enter the name");
		name=sc.nextLine();
		
		System.out.println("Enter the grade");
		grade=sc.nextInt();
		
		System.out.println("Enter the Percentage");
		Percentage=sc.nextDouble();
		
		Student s1= new Student();
		System.out.println(s1);
		sc.close();
        
	}

}
