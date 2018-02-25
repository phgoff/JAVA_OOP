
public class Teacher extends Person {
	private String factory;
	
	public Teacher(String name,int age, String factory) {
		super(name, age);
		this.factory = factory;
	}
	
	public String getFactory() {
		return this.factory;
	}
	
	public void setFactory(String factory) {
		this.factory =factory;
	}
	
	public void printDetails() {
		System.out.println("---Teacher---");
		super.printDetails();
        System.out.println("Factory: "+ factory);
      
    }

}
