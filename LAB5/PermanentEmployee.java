public class PermanentEmployee extends Employee{
	private int salary;
	
	public PermanentEmployee(String name,int age,int employeeid,int salary) {
		super(name, age, employeeid);
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;		
	}
	
	public void printDetails() {
		
		super.printDetails();
        System.out.println("Salary: " + salary);
       
    }
	
}
