public class Student extends Person {
	
	private String major;
	private double gpa;
	
	public Student(String name,int age,String major,double gpa) {
		super(name, age);
		this.major = major;
		this.gpa = gpa;
	}
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;	
	}
	public double getGPA() {
		return this.gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public void printDetails() {
		System.out.println("---Student---");
		super.printDetails();
        System.out.println("Major: " + major +" GPA: " + gpa);
     
        
    }
	
}
