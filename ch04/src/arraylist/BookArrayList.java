package arraylist;

import java.util.ArrayList;

import objectarray.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// 책을 저장할 ArrayList의 공간 생성
		ArrayList<Book> bookList = new ArrayList<>();
		
		//책 객체 생성
		Book book1 = new Book("반응형 웹사이트", "김은아");
		Book book2 = new Book("Tiny Python Project", "켄 유엔스-클락");
		Book book3 = new Book("혼자 공부하는 자바", "신용권");
		
		//bookList에 저장
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		//book1, 2의 정보 출력
		book1.bookInfo();
		book2.bookInfo();
		
		//book1의 정보를 인덱싱
		System.out.println(bookList.get(0));  //객체의 메모리 주소
		bookList.get(0).bookInfo();           //객체의 정보
		
		System.out.println();
		
		//전체 조회
		System.out.println(bookList.size());
		
		//전체 출력
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			book.bookInfo();
		}
		
		System.out.println();
		
		//요소 삭제
		if(bookList.contains(bookList.get(0)))
			bookList.remove(0);
		
		//향상 for문으로 출력(자료형 변수 : 리스트이름)
		for(Book book : bookList) {
			book.bookInfo();
		}
		
	}

}
