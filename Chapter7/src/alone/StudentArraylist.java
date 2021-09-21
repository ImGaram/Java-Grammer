package alone;

import java.util.ArrayList;

public class StudentArraylist {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		
		students.add(new Student("James", 1001));
		students.add(new Student("Tomas", 1002));
		students.add(new Student("Edward", 1003));
		
		for (int i = 0; i < students.size(); i++) {
			students.get(i).showStudentInfo();
		}
	}
}
