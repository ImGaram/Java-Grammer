package alone;

public class Car {
	public static int serialNum=10000;
	public int carNum;
	
	public Car() {
		serialNum++;
		carNum=serialNum;
	}
	
	public int gerCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum=carNum;
	}
}
