package objectarray;

public class Book {
	String bookName;
	String author;
	
	//생성자
	Book(String bookName, String author){
		this.bookName = bookName;
		this.author = bookName;
	}
	
	Book(){}  //기본생성자
	
	void bookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	//책 이름, 저자를 입력받는 메서드
	void setBookName(String bookName){
		this.bookName = bookName;
	}
	void setAuthor(String author){
		this.author = author;
	}
	
	
	//책 이름, 저자를 가져오는 메서드
	String getBookName(){
		return bookName;
	}
	String getAuthor(){
		return author;
	}
}
