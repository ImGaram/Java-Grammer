package staticEx;

public class Student2 {
	public static int serialNum=1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;			//�л��� ������ ������ ����
		studentID=serialNum;	//������ ���� �й��� �ο�
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
}
