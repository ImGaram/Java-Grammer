package alone;

public class CarFactoryTest {
	public static void main(String[] args) {
		CarFactory factory=CarFactory.getInstance();	//싱글톤 패턴
		Car mySonata= factory.createCar();				//메서드에서 car생성
		Car yourSonata=factory.createCar();
		System.out.println(mySonata.gerCarNum());
		System.out.println(yourSonata.gerCarNum());
	}
}
