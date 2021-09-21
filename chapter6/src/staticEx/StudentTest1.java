package staticEx;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이주원");
		System.out.println(Student1.serialNum);	//serialNum 변수의 초기값 출력
		Student1.serialNum++;	//static 변수 증가
		
		Student1 studentSon=new Student1();
		studentSon.setStudentName("손수정");
		System.out.println(Student1.serialNum);
		System.out.println(Student1.serialNum);
	}
}
