package arraycopy;

public class DeepCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("개미", "베짱이");
		array1[1] = new Book("페인트", "돌덩이");
		array1[2] = new Book("먐멤", "멈마");
		
		// 기본 생성자로 array2의 객체를 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		// array1을 array2에 복사 (setter, getter 쓴다)
		for(int i = 0; i < array1.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setBookName(array1[i].getAuthor());
		}
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i].toString());
			
		}

	}

}
