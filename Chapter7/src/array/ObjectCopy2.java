package array;

//객체 배열의 얕은 복사(주소값만 복사)
public class ObjectCopy2 {
	public static void main(String[] args) {
		Book bookarray1[]=new Book[3];
		Book bookarray2[]=new Book[3];
		
		bookarray1[0]=new Book("태백산맥","조정래");
		bookarray1[1]=new Book("데미안","헤르만 헤세");
		bookarray1[2]=new Book("어떻게 살 것인가","유시민");
		System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
		
		for (int i = 0; i < bookarray2.length; i++) {
			bookarray2[i].showBookInfo();
		}
		
		bookarray1[0].setBookName("나목");
		bookarray1[0].setAuthor("박완서");
		
		System.out.println("==bookarray1==");
		for (int i = 0; i < bookarray1.length; i++) {
			bookarray1[i].showBookInfo();
		}
		
		System.out.println("==bookarray2==");
		for (int i = 0; i < bookarray2.length; i++) {
			bookarray2[i].showBookInfo();
		}
		//객체 배열에 저장된 값은 인스턴스 주소 값임 => 두 배열이 같은 주소를 가리키고 있다
		//그래서 배열1 만 수정했는데도 배열 2도 바뀐 것임
	}
}
