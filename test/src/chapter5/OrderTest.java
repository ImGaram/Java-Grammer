package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order gogac=new Order( );
		
		gogac.ordernumber=201803120001l;
		gogac.id="abc123";
		gogac.day="2018�� 3�� 12��";
		gogac.name="ȫ���";
		gogac.obnumber="PD0345-12";
		gogac.juso="����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+gogac.ordernumber);
		System.out.println("�ֹ��� ���̵� : "+gogac.id);
		System.out.println("�ֹ� ��¥ : "+gogac.day);
		System.out.println("�ֹ��� �̸� : "+gogac.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+gogac.obnumber);
		System.out.println("�ֹ� �ּ� : "+gogac.juso);
	}

}
