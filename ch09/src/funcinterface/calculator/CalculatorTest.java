package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언
		Calculator add;
		int num1 = 10, num2 = 5;
		
		// Calculator()를 구현 - 람다식
		// 덧셈
		add = (x, y) -> (num1 + num2);
		
		// 호출
		System.out.println("덧셈: " + add.calculate(num1, num2));
		
		// 뺄셈
		add = (x, y) -> (num1 - num2);
		
		// 호출
		System.out.println("뺄셈: " + add.calculate(num1, num2));
		
		// 곱셈
		add = (x, y) -> (num1 * num2);
		
		// 호출
		System.out.println("곱셈: " + add.calculate(num1, num2));
		
		// 나눗셈
		add = (x, y) -> (num1 / num2);
		
		// 호출
		System.out.println("나눗셈: " + add.calculate(num1, num2));
		

	}

}
