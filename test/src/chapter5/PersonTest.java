package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person( );
		person.age = 40;
		person.name = "James";
		person.ismarried = true;
		person.ja = 3;
		
		System.out.println("나이 :"+person.age);
		System.out.println("이름 :"+person.name);
		System.out.println("결혼 여부 :"+person.ismarried);
		System.out.println("자녀 수 :"+person.ja);
	}

}
