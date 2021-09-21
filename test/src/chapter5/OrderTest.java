package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order gogac=new Order( );
		
		gogac.ordernumber=201803120001l;
		gogac.id="abc123";
		gogac.day="2018년 3월 12일";
		gogac.name="홍길순";
		gogac.obnumber="PD0345-12";
		gogac.juso="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+gogac.ordernumber);
		System.out.println("주문자 아이디 : "+gogac.id);
		System.out.println("주문 날짜 : "+gogac.day);
		System.out.println("주문자 이름 : "+gogac.name);
		System.out.println("주문 상품 번호 : "+gogac.obnumber);
		System.out.println("주문 주소 : "+gogac.juso);
	}

}
