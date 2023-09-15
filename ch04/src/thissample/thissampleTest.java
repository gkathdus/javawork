package thissample;

public class thissampleTest {

	public static void main(String[] args) {
		// 생성된 인스턴트 - bDay와 클래스와 this 속성의 주소 같음
		Birthday bDay = new Birthday();
		bDay.setYear(2023);
		
		System.out.println(bDay);
		
		bDay.printThis();

	}

}
