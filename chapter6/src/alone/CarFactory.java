package alone;
public class CarFactory {

	private static CarFactory instance=new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance==null) {
			instance=new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {	//새로운 차 만드는 생성자
		Car car=new Car();
		return car;
	}
}
