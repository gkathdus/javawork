package exceptions.throwex;

public class ThrowsTest {

	public static void main(String[] args) {
		// 호출한 곳에서 예외 처리함
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.toString());
		}

	}
	
	public static void findClass() throws ClassNotFoundException {
		// 컴파일러가 페크해줌 - 일반 예외
		// throw는 예외 이름
		Class.forName("java.lang.System2");
	}

}
