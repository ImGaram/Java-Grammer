package chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogs=new Dog[5];
		dogs[0]=new Dog("��1", "Ÿ��1");
		dogs[1]=new Dog("��2", "Ÿ��2");
		dogs[2]=new Dog("��3", "Ÿ��3");
		dogs[3]=new Dog("��4", "Ÿ��4");
		dogs[4]=new Dog("��5", "Ÿ��5");
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println("=���� for=");
		for (Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}
