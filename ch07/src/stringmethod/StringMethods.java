package stringmethod;

public class StringMethods {

	public static void main(String[] args) {
		// 문자열 다루기
		// 문자열은 특별한 1차원 배열이라고 추정
		// charAt() : 해당 인덱스의 문자를 리턴함
		String subject = "자바 프로그래밍";
		
		char ch = subject.charAt(1); // 해당 인덱스의 문자를 리턴함
		System.out.println(ch);
		
		// 주민번호로 성별 구분
		String 주민번호 = "031019-4545566";
		char 성별 = 주민번호.charAt(7);
		switch(성별) {
		case '1' : case '3':
			System.out.println("남자라우");
		case '2' : case '4':
			System.out.println("여자라우");
			break;
		}
		// subString(첫 문자, 끝 문자 -1) - 문자를 추출하는 메서드 - 마지막 인덱스는 끝 문자 -1임
		String 생년월일 = 주민번호.substring(0, 6);
		System.out.println(생년월일);
		
		String secondNum = 주민번호.substring(7); // 7번 인덱스부터 마지막까지임
		
		System.out.println(secondNum);

	}

}
