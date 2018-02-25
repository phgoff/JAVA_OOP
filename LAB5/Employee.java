
public class Employee extends Person{
	private int employeeid;
	
	public Employee(String name,int age,int employeeid) {
		super(name, age);
		this.employeeid = employeeid;
	}
	
	public int getEmployeeid() {
		return this.employeeid;
	}
	
	public void setEmployee(int employeeid) {
		this.employeeid = employeeid;		
	}
	
	public void printDetails() {
		System.out.println("---Employee---");
		super.printDetails();
        System.out.println("EmployeeID: " + employeeid);
    }
}
