package chapter5;

public class SachicAencan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(3, 2));
		System.out.println(min(4, 7));
	}

	public static int mul(int n1,int n2) {
		int result = n1 +n2;
		return result;
	}
	
	public static int min(int n1,int n2) {
		int result = n1 -n2;
		return result;
	}
	
	public static int gop(int n1,int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double nan(int n1,int n2) {
		int result = n1 / n2;
		return result;
	}
}
