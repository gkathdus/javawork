package continueexam;

public class ContinueTest2 {

	public static void main(String[] args) {
		// 1. 일반 for문 : 1~10까지 자연수 중 홀수만 출력
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) {
				//System.out.println(i);
			}
			
		}
		
		// 2. continue를 사용해서 1~10까지 자연수 중 홀수만 출력
		for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 짝수일 경우 다음 반복으로 건너뛴다.
            }
            System.out.println(i);
		}
		
	}

}
