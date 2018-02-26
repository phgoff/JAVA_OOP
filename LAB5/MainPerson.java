import java.util.ArrayList;

public class MainPerson {

	public static void main(String[] args) {
		 //Person p1 = new Person("John",50);
		//Student s1= new Student("Jack", 19, "COE", 3.99);
		// Teacher t1 = new Teacher("Otega", 26, "SNK");
		// Employee e1 =new Employee("Ben", 40, 10011);
		// PermanentEmployee pe1 = new PermanentEmployee("Bob", 36, 10012, 50000);
		// ContactEmployee ce1 = new ContactEmployee("Mark", 33, 10013, 65000);


//8Arraylist 
		ArrayList<Person> list = new ArrayList<Person>();
		//ArrayList<Student> liststd = new ArrayList<Student>();
		list.add(new Person("Me",24));
		list.add(new Employee("Ben", 40, 10011));

		//list.add(new Student("Jack", 19, "COE", 3.99));
		// liststd.add(new Student("Mark", 22, "XOE", 2.99));
		// liststd.add(new Student("Bob", 23, "COE", 4.0));

		for(Person p : list){
			p.printDetails();
		}

		int sz = list.size();
		System.out.println("Size: " + sz); 
		
		// p1.printDetails();
		// s1.printDetails();
		// t1.printDetails();
		// e1.printDetails();
		// pe1.printDetails();
		// ce1.printDetails();
		
		 // p1.setName("Mister John");
		 // p1.setAge(99);
		 // p1.printDetails();




		
	}
	
}
