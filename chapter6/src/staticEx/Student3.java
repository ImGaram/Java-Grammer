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
	
	//serialNum의 메소드
	public static int getSerialNum() {
		//int i=10;
		//studentName="이지원";	studentName이 인스턴스 변수이기 때문에 오류 발생
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum=serialNum;
	}
}
