package staticEx;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1 studentLee=new Student1();
		studentLee.setStudentName("���ֿ�");
		System.out.println(Student1.serialNum);	//serialNum ������ �ʱⰪ ���
		Student1.serialNum++;	//static ���� ����
		
		Student1 studentSon=new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student1.serialNum);
		System.out.println(Student1.serialNum);
	}
}
