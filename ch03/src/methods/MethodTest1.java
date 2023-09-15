package methods;

public class MethodTest1 {
	
	// 변수의 선언과 사용
	// 함수 정의(선언)와 호출(사용)

	public static void main(String[] args) {
		sayhello();
		sayhello(" 파이썬");
	

	}
	// sayhello()이름의 함수를 정의
	// void - 반환값이 없음(비어있다)
	public static void sayhello() {
		System.out.println("안녕~ 자바");
		
	}
	
	// 매개변수(parameter)가 있는 함수 정의
	public static void sayhello(String name) {
		System.out.println("안녕~" + name);
	}

}
