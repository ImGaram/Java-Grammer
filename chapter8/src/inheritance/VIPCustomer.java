package inheritance;

//VIPCustomer 클래스는 Customer 클래스를 상속받음
public class VIPCustomer extends Customer {

	private int agentID;	//vip 고객 상담원 id
	double saleRatio;		//할인율
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	//명시적으로 상위 클래스 생성자 호출하기
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade="VIP";	//고객 등급 vip
		bonusRatio=0.05;		//보너스 적립 5%
		saleRatio=0.1;			//할인율 10%
		this.agentID=agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");	//하위 클래스 생성할때 콘솔 출력문
	}
	
	//calcPrice메서드 재정의하기
	@Override
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*saleRatio);		//보너스 포인트 적립
		return price-(int)(price*saleRatio);	//할인율 적용
	}
	
	//vip 고객에게만 필요한 매서드
	public int getAgentID() {
		return agentID;
	}
}
