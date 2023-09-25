package stream.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
	// 필드
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	

}

public class BookTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("옥상에서 10분만", 18000));
		bookList.add(new Book("나미야 잡화점의 기적", 23000));
		bookList.add(new Book("돌멩이", 21000));
		
		Stream<Book> stream = bookList.stream();
		
		int total = bookList.stream()
				.mapToInt(t -> t.getPrice())
				.sum();
		
		System.out.println("모든 책의 가격의 합은 " + total + "원입니다.");
		
		System.out.println("=== 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력 ===");
		
		bookList.stream()
				.filter(b -> b.getPrice() >= 20000)
				.map(b -> b.getName())
				.sorted()
				.forEach(n -> System.out.println(n));
				

	}

}
