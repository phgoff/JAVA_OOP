
public class ContactEmployee extends Employee{
	private int payment;
	
	public ContactEmployee(String name,int age,int employeeid,int payment) {
		super(name, age, employeeid);
		this.payment = payment;
	}
	
	public int getPayment() {
		return this.payment;
	}
	
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	public void printDetails() {

		super.printDetails();
        System.out.println("Paymet: " + +payment);
    }
}
