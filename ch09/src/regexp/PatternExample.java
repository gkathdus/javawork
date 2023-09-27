package regexp;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		// 전화번호 형식 검증하기
		String regExp = "(02|010)-\\d(3,4)-\\d(4)";
		String phone = "010-1234-5678";
		
		boolean result = Pattern.matches(regExp, phone);
		
		if(result) {
			System.out.println("정규식과 일치합니다");
		}else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		// 계좌번호
		regExp = "\\d{2}-\\d{3,4}";
		String account = "aa-1234";
		result = Pattern.matches(regExp, account);
		
		if(result) {
			System.out.println("계좌번호 형식과 일치합니다");
		}else {
			System.out.println("계좌번호 형식과 일치하지 않습니다. 다시 입력해");
		}

	}

}
