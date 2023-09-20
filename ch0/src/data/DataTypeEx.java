package data;

public class DataTypeEx {

	public static void main(String[] args) {
		// int, long의 사용 (차이점)
		// int형 크기 - 4Byte(32bit)(2의 32 제곱...?) -21억 ~ 21억
		// long형은 - 8Byte(64bit)
		
		int num1 = 1234567890; // 12억
		long num2 = 12345678900L; // 자바에서는 int를 기본으로 하기 때문에 구별하기 위해서 끝에 대문자 L이나 또는 소문자 l을 붙여야 함
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
