package chapter7;

public class CharacterConversion {
	public static void main(String[] args) {
		int charNum[]=new int[26];
		int num=65;
		
		for (int i = 0; i < charNum.length; i++) {
			charNum[i]=num+32;
			num++;
			System.out.println((char)charNum[i]);
		}
		System.out.println();
	}
}
