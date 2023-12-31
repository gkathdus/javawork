package arraycopy;

// 얕은 복사
public class ShallowCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("개미", "베짱이");
		array1[1] = new Book("페인트", "돌덩이");
		array1[2] = new Book("먐멤", "멈마");
		
		// array1 의 첫 번째 요소 수정
		array1[0].setBookName("에에엥");
		array1[0].setAuthor("먕ㅇ아ㅏ앙");
		
		// 배열 복사
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i] ;
		}
		System.out.println("array1 출력");
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i].toString());
		}
		
		System.out.println("array2 출력");
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		// Clone() 배열 복사
		Book[] array3 = array2.clone();
		
		System.out.println("array3 출력");
		for(int i = 0; i < array3.length; i++) {
			System.out.println(array3[i].toString());
		}
		
		// 항상 for문
		// for (자료형 변수 : 배열 이름) {변수 출력}
		System.out.println("array3 출력");
		for(Book arr3 : array3) {
			System.out.println(arr3.toString());
		}

	}

}
