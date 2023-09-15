package methods;

public class OneUpTest1 {
	
	// 1증가 하는 함수 정의
	// 지역 변수의 생명 주기(scope)
			public static int oneUp() {
				int x = 1; // 지역 변수
				x++; // x += 1
				return x;
			}

	public static void main(String[] args) {
		System.out.println(oneUp()); // 2
		System.out.println(oneUp()); // 2
		
		
		
			
		}

	}


