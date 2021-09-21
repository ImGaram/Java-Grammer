package chapter4;

public class Star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 7;
		int num2 = num1/2+1;
		int snum=1;
		
		for (int i=0;i<num1;i++) {
			for (int j=0;j<num2;j++) {
				System.out.print(' ');
			}
			for (int j=0;j<snum;j++) {
				System.out.print('*');
			}
			for (int j=0;j<snum;j++) {
				System.out.print(' ');
			}
			
			if (i<num1/2) {
				num2-=1;
				snum+=2;
			}
			else {
				num2+=1;
				snum-=2;
			}
			System.out.println();
		}
	}

}
