package thisEx;

class Person{
	String name;
	int age;
	
	Person(){
		//this.name="noname";
		this("이름 없음",1);	//Person 호출
	}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName=new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
