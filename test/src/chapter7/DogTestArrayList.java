package chapter7;

import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList=new ArrayList<Dog>();
		dogList.add(new Dog("��1", "Ÿ��1"));
		dogList.add(new Dog("��2", "Ÿ��2"));
		dogList.add(new Dog("��3", "Ÿ��3"));
		dogList.add(new Dog("��4", "Ÿ��4"));
		dogList.add(new Dog("��5", "Ÿ��5"));
		
		for (int i = 0; i < dogList.size(); i++) {
			//ArrayList ��� Arraylist�̸�.get(����).????
			System.out.println(dogList.get(i).showDogInfo());
		}
		System.out.println("==���� for��===");
		for (Dog dog : dogList) {
			//���� for������ Arraylist���
			System.out.println(dog.showDogInfo());
		}
	}
}
