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
		public void removeStudentBystCode(String stCode){
			for(int i=0; i<this.stdlist.size(); i++){
				if (this.stdlist.get(i).getCode() == stCode){
					stdlist.remove(i);
				}
			}
		}

		public void ShowAllStudentinfo(){
			for(Student student: this.stdlist){
				System.out.println(student.toString());
			}
		}

		public int getNumberofStudent(){
			return this.stdlist.size();
		}


}
