package thisEx;

class Person1 {
	String name;
	int age;
	
	Person1(){
		this("이름 없음",1);
	}
	
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	Person1 returnItSelf() {
		return this;
	}
} 

public class CallAnotherCont {

	public static void main(String[] args) {
		Person1 noName=new Person1();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person1 p= noName.returnItSelf();	//this 값을 클래스 변수에 대입
		System.out.println(p);				//noName의 반환 값 출력
		System.out.println(noName);			//참조 변수 출력
	}

}
