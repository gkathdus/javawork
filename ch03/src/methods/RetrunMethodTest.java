package methods;

public class RetrunMethodTest {
	
	// return이 있는 함수(반환 자료형) - int, String
	// 호출한 곳으로 반환값을 보냄

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		// 더하기 함수 호출
		int result = add(n1, n2);
		System.out.println("결과값: " + result);
		
		// 제곱수 호출
		int result2 = square(n1);
		System.out.println("결과값2: " + result2);
		
		// 메세지 호출
		String msg = message();
		System.out.println(msg);
		
	}
	
	// return이 있고, 매개변수 2개인 함수 이름 - add()
	public static int add(int a, int b) {
		return a + b;
	}
	
	// 매개변수 1개인 함수
	public static int square(int x) { // 제곱수를 계산하는 함수
		return x * x;
		
	}
	
	// return이 있고, 매개변수 없는 함수
	public static String message() {
		return "good luck";
	}

}
