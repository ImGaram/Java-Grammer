package array;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets=new char[26];
		int ch=65;
		
		for(int i=0;i<alphabets.length;i++) {
			alphabets[i]=(char)ch;	//ch�� ���ڷ� ��ȯ�� �� ��ҿ� ����
			ch++;
		}
		
		for (int i=0;i<alphabets.length;i++) {
			System.out.println(alphabets[i]+":"+(int)alphabets[i]);
		}
	}

}
