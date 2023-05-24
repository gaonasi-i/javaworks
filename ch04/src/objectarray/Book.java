package objectarray;

public class Book {
	String bookName;
	String author;
	
	//생성자
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	//생성자 오버로딩
	public Book(){}  //기본생성자
	
	//메개변수가 있는 생성자
	public void bookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	//책 이름, 저자를 입력받는 메서드
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	
	
	//책 이름, 저자를 가져오는 메서드
	public String getBookName(){
		return bookName;
	}
	public String getAuthor(){
		return author;
	}
}
