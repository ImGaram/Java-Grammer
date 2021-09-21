package cooperation;

public class Taxi {
	String taxiColor;		//택시 색
	int passengerCount;		//이용자 수
	int money;				//수익
	
	public Taxi(String taxiColor) {
		this.taxiColor=taxiColor;
	}
	
	public void take(int money) {
		this.money+=money;		//수익 증가
		passengerCount++;		//승객 증가
	}
	
	public void showInfo() {
		System.out.println(taxiColor+"색 택시의 승객은"+passengerCount+"이고, 수익은"+money+"입니다.");
	}
}
