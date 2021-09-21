package alone;

public class Student {
	int studentID;
	String studentName;
	
	public Student(String studentName, int studentID) {
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID+","+studentName);
	}
}
