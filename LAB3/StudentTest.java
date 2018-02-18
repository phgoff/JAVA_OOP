import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		StudentList stdList = new StudentList();
		Student s1,s2,s3;
		s1 = new Student("101","Phirathat",3.10);
		s2 = new Student("102","Takashi",2.99);
		s3 = new Student("103","Otega",4.00);
		
		stdList.addStudent(s1);
		stdList.addStudent(s2);
		stdList.addStudent(s3);
		
		stdList.ShowAllStudentinfo();
		System.out.println("Search StudentbyCode:"+ 
				stdList.searchStudentBystCode("101"));
		stdList.removeStudentBystCode("102");
		System.out.println("Remove Success");
		stdList.ShowAllStudentinfo();
	}
}
