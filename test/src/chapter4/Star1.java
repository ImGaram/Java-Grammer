package chapter4;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4;  
		int num2 = num1/2 +1;
		int num3 = 1;
		
		for(int i = 0; i<num1; i++) {
			for(int j = 0; j<num2; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<num3; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<num2; j++) {
				System.out.print(' ');
			}
			num2-=1;
			num3+=2;
			System.out.println();
		}
	}

}
