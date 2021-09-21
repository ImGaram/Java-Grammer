package alone;

public class TwoDimensionPractice {
	public static void main(String[] args) {
		//num[행 개수][문자 개수]
		int charNum[][]=new int[13][2];
		int num=97;
		
		for (int i = 0; i < charNum.length; i++) {
			for (int j = 0; j < charNum[i].length; j++) {
				charNum[i][j]=(char)num;
				num++;
				System.out.println((char)charNum[i][j]);
			}
			System.out.println();
		}
	}
}
