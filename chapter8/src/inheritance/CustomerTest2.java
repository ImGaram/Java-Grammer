package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		//클래스 형변환
		//vipcustomer는 customer의 기능도 가지고 있기 때문에 vipcustomer 형이면서 customer 형이기도 함
		Customer vc=new VIPCustomer(10020,"김유신",12345);
		VIPCustomer customerKim=new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint=10000;
		System.out.println(vc.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		//상위 클래스인 customer() 생성자가 먼저 호출됨, 그 다음에 VIPCustomer() 호출(하위 클래스)
	}
}
