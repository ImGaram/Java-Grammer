package chapter7;

public class DogTest {
	public static void main(String[] args) {
		Dog[] dogs=new Dog[5];
		dogs[0]=new Dog("개1", "타입1");
		dogs[1]=new Dog("개2", "타입2");
		dogs[2]=new Dog("개3", "타입3");
		dogs[3]=new Dog("개4", "타입4");
		dogs[4]=new Dog("개5", "타입5");
		
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println("=향상된 for=");
		for (Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}
