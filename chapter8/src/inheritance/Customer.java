package inheritance;

public class Customer {
	//protected 변수 선언
	protected int customerID;			//고객 아이디
	protected String customerName;		//고객 이름
	protected String customerGrade;		//고객 등급
	int bonusPoint;						//보너스 포인트
	double bonusRatio;					//적립 비율
	
	//디폴트 생성자
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//디폴트 생성자를 없애고 새로운 생성자를 작성하면 상속받은 클래스에 오류가 발생함
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="Silver";	//기본 등급
		bonusRatio=0.01;		//보너스 포인트 기본 적립 기능
		System.out.println("Customer() 생성자 호출");	//상위 클래스 생성할때 콘솔 출력문
	}
	
	//보너스 포인트 적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;	//보너스 포인트 계산
		return price;
	}
	
	//고객 정보 반환
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
	
	//protected 예약어로 선언한 변수를 외부에서 사용할수 있도록 메서드 추가
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade=customerGrade;
	}
}
