package staticEx;

public class Student3 {
	private static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	
	//serialNum�� �޼ҵ�
	public static int getSerialNum() {
		//int i=10;
		//studentName="������";	studentName�� �ν��Ͻ� �����̱� ������ ���� �߻�
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum=serialNum;
	}
}
