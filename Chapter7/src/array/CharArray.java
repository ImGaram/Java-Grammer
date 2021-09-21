package array;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets=new char[26];
		int ch=65;
		
		for(int i=0;i<alphabets.length;i++) {
			alphabets[i]=(char)ch;	//ch를 문자로 변환해 각 요소에 대입
			ch++;
		}
		
		for (int i=0;i<alphabets.length;i++) {
			System.out.println(alphabets[i]+":"+(int)alphabets[i]);
		}
	}

}
