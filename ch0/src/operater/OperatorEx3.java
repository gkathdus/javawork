package operater;

public class OperatorEx3 {

	public static void main(String[] args) {
		// 조건 연산자 -> 조건문(if문)
		// 결과값 = (조건비교) ? 참값 : 거짓값
		
		// 예제 1. 결과값 정수면 정수 변수(int형) 선언
		int num = (4 > 5) ? 10 : 20; // 4 > 5가 false이므로 20을 반환
		System.out.println("결과값: " + num);
		
		// 예제 2. 결과값이 한 문자로 출력 : 'T' / 'F' (반환)
		int fatherAge = 45;
		int motherAge = 48;
		
		char result = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println("결과값: " + result); // 'F'
		
		// 예제 3. 짝수/홀수 판정하는 프로그램
		// 어떤 수(변수)를 2로 나눠서 나머지가 0이면 짝수, 1이면 홀수
		// 결과값이 "짝수입니다." 또는 "홀수입니다."
		int number = 10;
		
		String msg = (number % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("판정: " + msg);
		
		

	}

}
