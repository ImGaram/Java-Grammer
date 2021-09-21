package chapter4;

public class EvenMultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i%2!=0) {
					continue;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
