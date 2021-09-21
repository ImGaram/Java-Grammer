package staticEx;

public class Student2 {
	public static int serialNum=1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;			//학생이 생성될 때마다 증가
		studentID=serialNum;	//증가된 값을 학번에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
}
