package alone;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance();	//�̱��� ����
		Car mySonata= factory.createCar();				//�޼��忡�� car����
		Car yourSonata=factory.createCar();
		System.out.println(mySonata.gerCarNum());
		System.out.println(yourSonata.gerCarNum());
	}
}
