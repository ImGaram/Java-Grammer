package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		//Ŭ���� ����ȯ
		//vipcustomer�� customer�� ��ɵ� ������ �ֱ� ������ vipcustomer ���̸鼭 customer ���̱⵵ ��
		Customer vc=new VIPCustomer(10020,"������",12345);
		VIPCustomer customerKim=new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint=10000;
		System.out.println(vc.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		//���� Ŭ������ customer() �����ڰ� ���� ȣ���, �� ������ VIPCustomer() ȣ��(���� Ŭ����)
	}
}
