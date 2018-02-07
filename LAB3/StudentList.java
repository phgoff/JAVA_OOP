import java.util.*;
public class StudentList{
		private ArrayList<Student> stdlist;

		public StudentList(){
			this.stdlist = new ArrayList<Student>();
		}

		public void addStudent(Student std){
			this.stdlist.add(std);
		}

		public int searchStudentBystCode(String stCode){
			for(int i=0; i<this.stdlist.size(); i++){
				if (this.stdlist.get(i).getCode() == stCode){
					return i;
				}
			}
		}
		public removeStudentBystCode(String stCode){
		}

		public void ShowAllStudentinfo(){
			for(Student student: this.StudentList){
				System.out.println(student.toString());
			}
		}

		public int getNumberofStudent(){
			return this.StudentList.size();
		}


}