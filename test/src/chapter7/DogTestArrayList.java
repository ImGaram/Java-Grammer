package chapter7;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList=new ArrayList<Dog>();
		dogList.add(new Dog("개1", "타입1"));
		dogList.add(new Dog("개2", "타입2"));
		dogList.add(new Dog("개3", "타입3"));
		dogList.add(new Dog("개4", "타입4"));
		dogList.add(new Dog("개5", "타입5"));
		
		for (int i = 0; i < dogList.size(); i++) {
			//ArrayList 출력 Arraylist이름.get(변수).????
			System.out.println(dogList.get(i).showDogInfo());
		}
		System.out.println("==향상된 for문===");
		for (Dog dog : dogList) {
			//향상된 for에서의 Arraylist출력
			System.out.println(dog.showDogInfo());
		}
	}
}
