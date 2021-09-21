package inheritance;

public class Customer {
	//protected ���� ����
	protected int customerID;			//�� ���̵�
	protected String customerName;		//�� �̸�
	protected String customerGrade;		//�� ���
	int bonusPoint;						//���ʽ� ����Ʈ
	double bonusRatio;					//���� ����
	
	//����Ʈ ������
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//����Ʈ �����ڸ� ���ְ� ���ο� �����ڸ� �ۼ��ϸ� ��ӹ��� Ŭ������ ������ �߻���
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="Silver";	//�⺻ ���
		bonusRatio=0.01;		//���ʽ� ����Ʈ �⺻ ���� ���
		System.out.println("Customer() ������ ȣ��");	//���� Ŭ���� �����Ҷ� �ܼ� ��¹�
	}
	
	//���ʽ� ����Ʈ ����, ���� ���� ��� �޼���
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;	//���ʽ� ����Ʈ ���
		return price;
	}
	
	//�� ���� ��ȯ
	public String showCustomerInfo() {
		return customerName+"���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�.";
	}
	
	//protected ������ ������ ������ �ܺο��� ����Ҽ� �ֵ��� �޼��� �߰�
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
