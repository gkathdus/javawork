package arraycopy;

public class BookTest {

	public static void main(String[] args) {
		// 객체를 저장할 크기가 3인 배열 생성
		Book[] books = new Book[3];
		
		// 객체 3번 생성
		Book book1 = new Book("개미", "베짱이");
		Book book2 = new Book("페인트", "돌덩이");
		Book book3 = new Book("먐멤", "멈마");
		
		// 인덱스 순서에 따라 저장
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		/*for(int i = 0; i < books.length; i++) {
			books[i] = book(i + 1);
		}*/ // 이건 안 됨
		
		// 1개 출력
		// System.out.println(books[2]);
		
		// 전체 출력
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
		
		
		// System.out.println(book1);
		// System.out.println(book1.toString());

	}

}
