package inheritance;

//VIPCustomer Ŭ������ Customer Ŭ������ ��ӹ���
public class VIPCustomer extends Customer {

	private int agentID;	//vip �� ���� id
	double saleRatio;		//������
	
	public VIPCustomer()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	//��������� ���� Ŭ���� ������ ȣ���ϱ�
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade="VIP";	//�� ��� vip
		bonusRatio=0.05;		//���ʽ� ���� 5%
		saleRatio=0.1;			//������ 10%
		this.agentID=agentID;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");	//���� Ŭ���� �����Ҷ� �ܼ� ��¹�
	}
	
	//calcPrice�޼��� �������ϱ�
	@Override
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*saleRatio);		//���ʽ� ����Ʈ ����
		return price-(int)(price*saleRatio);	//������ ����
	}
	
	//vip �����Ը� �ʿ��� �ż���
	public int getAgentID() {
		return agentID;
	}
}
