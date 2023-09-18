package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		// String name = "함쏘"; // 스택 영역
		String name1 = new String("함소연"); // 힙 메모리
		String name2 = new String("서우창");
		
		// 인스턴스의 메모리 주소 비교
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		System.out.println(name1 == name2); // 주소 비교 - false
		System.out.println(name1.equals(name1)); // 문자열 비교 - true
		
		System.out.println("==================================");
		
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "오징어");
		
		System.out.println(book1 == book2); // 주소 - false
		System.out.println(book1.equals(book2)); // 문자열 비교 - false
		
		// book 인스턴스의 물리적 주소
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		// 논리적 주소 일치 시킴 - hashCode() : Object 클래스가 제공

	}

}
