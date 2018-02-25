import java.util.ArrayList;

public class StudentList {
	
	private ArrayList<Student> stdList;
	// Constructor
	public StudentList() {
		this.stdList = new ArrayList<Student>();
	}
	//Method 
	public void addStudent(Student std) {
		this.stdList.add(std);
	}
	
	public Student searchStudentBystCode(String stCode){
		for(int i=0;i<this.stdList.size();i++) {
			if(this.stdList.get(i).getCode() == stCode) {
				return this.stdList.get(i);
			}
		}
		return new Student();
	}
	public void removeStudentBystCode(String stCode){
		for(int i=0;i< this.stdList.size();i++) {
			if(this.stdList.get(i).getCode() == stCode ) {
				stdList.remove(i);
			}
		}
	}

	public void ShowAllStudentinfo(){
		for(Student student: this.stdList){
			System.out.println(student.toString());
		}
	}

	public int getNumberofStudent(){
		return this.stdList.size();
	}

}
