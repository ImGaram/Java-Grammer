package thisEx;

class Person{
	String name;
	int age;
	
	Person(){
		//this.name="noname";
		this("�̸� ����",1);	//Person ȣ��
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
