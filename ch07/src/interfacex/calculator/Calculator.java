package interfacex.calculator;

// 구성 요소 - 상수, 메서드
// 인터페이스는 모든 메서드가 추상 메서드이다.
public interface Calculator {
	// 인터페이스 상수 파이널 생략해도됨
	// 변수를 선언해도 오류가 나지 않는 이유는 상수로 변환됨
	
	int ERROR = -99999;
	
	// 추상 메서드 - 선언부만 있고 구현은 안 함
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);

}
