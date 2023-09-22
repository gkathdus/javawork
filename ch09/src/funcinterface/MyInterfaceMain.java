package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {

		MyFunction1 function;
		
		// 람다식 표현으로 추상 메서드를 실제로 구현
		// 매개변수가 없음 - 빈 소괄호 사용
		// 코드가 한 줄인 경우 {} 중괄호 생략 가능
		/*function = () -> {
			System.out.println("안녕");
		};*/
		
		function = () -> System.out.println("안녕");
		
		// 실행 함수 호출
		function.method();

	}

}
