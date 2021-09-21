package chapter7;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		int zzaksu[]=new int[5];
		int temp=2;
		int total=0;
		
		for (int i = 0; i < zzaksu.length; i++) {
			zzaksu[i]=temp;
			temp+=2;
			total+=zzaksu[i];
		}
		System.out.println(total);
	}
}
