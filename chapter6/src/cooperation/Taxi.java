package cooperation;

public class Taxi {
	String taxiColor;		//�ý� ��
	int passengerCount;		//�̿��� ��
	int money;				//����
	
	public Taxi(String taxiColor) {
		this.taxiColor=taxiColor;
	}
	
	public void take(int money) {
		this.money+=money;		//���� ����
		passengerCount++;		//�°� ����
	}
	
	public void showInfo() {
		System.out.println(taxiColor+"�� �ý��� �°���"+passengerCount+"�̰�, ������"+money+"�Դϴ�.");
	}
}
