package Assignment;

public class Student {
	private String name;
	private int rollNo;
	private char grade;
    private double percentage;
	public Student(String name, int rollNo, char grade, double percentage) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + ", percentage=" + percentage + "]";
	}
	
}
