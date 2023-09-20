package exceptions;

public class ExceptionHandling2 {
	
	public static void printLength(String data) {
		// 예외 처리 (실행 예외-한타임 오류)
		try {
			int count = data.length();
			System.out.println("문자 수: " + count);	
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); // 경로를 추적해서 에러를 출력
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		
		printLength("지하철");
		printLength(null);
		
		System.out.println("[프로그램 종료]");

	}

}
