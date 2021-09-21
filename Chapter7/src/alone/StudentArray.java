package alone;

public class StudentArray {
	public static void main(String[] args) {
		Student[] students=new Student[3];
		students[0]=new Student("James", 1001);
		students[1]=new Student("Tomas", 1002);
		students[2]=new Student("Edward", 1003);
		
		for(int i=0;i<students.length;i++) {
			students[i].showStudentInfo();
		}
	}
}
