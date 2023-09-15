package basicclass;

public class Book extends Object {
	int bookNumber;  // 책 번호
	String bookTitle; // 책 제목
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		
	}
	
	// 메서드 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
	

}
