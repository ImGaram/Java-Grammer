package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		//Customer customLee=new Customer(10010,"이순신");
		Customer customLee =new Customer();
		customLee.setCustomerID(10010);
		customLee.setCustomerName("이순신");
		customLee.bonusPoint=1000;
		System.out.println(customLee.showCustomerInfo());
		
		//VIPCustomer customKim=new VIPCustomer(10020,"김유신",12345);
		VIPCustomer customKim=new VIPCustomer();
		customKim.setCustomerID(10020);
		customKim.setCustomerName("김유신");
		customKim.bonusPoint=10000;
		System.out.println(customKim.showCustomerInfo());
	}
}
