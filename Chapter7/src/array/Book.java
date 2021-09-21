package array;

//객체 배열 만들기
public class Book {
	private String bookName;
	private String author;
	
	public Book() {}	//디폴트 생성자
	
	public Book(String bookName, String author) {	//책 이름과 저자를 매개 변수에 대입
		this.bookName=bookName;
		this.author=author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName+","+author);
	}
}
