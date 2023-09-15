package data;

public class CharType {

	public static void main(String[] args) {
		// 유니코드 - 16bit - 2Byte
		char uniCode1 = '한'; // 한 문자 - 흩따옴표
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';
		System.out.print(uniCode2); // 한
		
		char uniCode3 = '\uAE00';
		System.out.print(uniCode3); // 글

	}

}
