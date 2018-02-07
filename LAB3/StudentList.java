import java.util.*;
public class StudentList{
		private ArrayList<Student> stlist;

		public	StudentList(){
			this.stlist = new ArrayList<Student>();
		}

		public void addStudent(Student std){
			this.stlist.add(std);
		}

		public int searchStudentBystCode(String stCode){
			for(int i=0; i<this.stlist.size(); i++){
				if (this.stlist.get(i).getCode() == stCode){
					return i;
				}
			}

		}
		public removeStudentBystCode(String stCode){
		}

		public ShowAllStudentinfo(){
		}

		

		public getNumberofStudent(){
		}


}