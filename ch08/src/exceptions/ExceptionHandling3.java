package exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// 일반 예외 - 컴파일 오류(컴파일러 체크)
		try {
			// 클래스 이름 잘못 기록하면 에러 발생
			Class.forName("java.lang.String");
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}finally { // 프로그램 상 항상 실행해야 할 경우에 사용함
			System.out.println("항상 수행됨");
		}

	}

}
