import java.util.*;
public class StudentTest{

	public static void main(String[] args) {
		StudentList stList = new StudentList();
	
		Student a,b;
			a = new Student("101","Bob",5.55);
			b = new Student("102","John",4.44);
			stList.addStudent(a);
			stList.addStudent(b);

			System.out.println("List: ");
			stList.ShowAllStudentinfo();
			stList.removeStudentBystCode("101");

			System.out.println("New List After remove: ");
			stList.ShowAllStudentinfo();
			System.out.println("List: "+ stList.getNumberofStudent());			
	}

}
