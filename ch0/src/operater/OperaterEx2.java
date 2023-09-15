package operater;

public class OperaterEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수를 사용하여 비교연산하기
		int n1 = 4 , n2 = 5; // 변수2개를 연속으로 선언
				
		//손흥민 선수가 미혼
		//결과가 "미혼입니다."
		boolean ismerried = false;
		System.out.println(ismerried);
		
		//조건연산자 : (비교값 ? 참인값 : 거짓인값)
		String result = (ismerried == true) ? "기혼입니다." : "미혼입니다.";
		System.out.println("손흥민 선수는" +  result);
		
		//점수의 합계 평균
		
		int korScore = 95; //국어점수가 90점
		int mathScore = 80; // 
		int sumScore; //합계 변수 선언
		double avgScore;  // 평균 = 총점 / 과목수
		
		sumScore = korScore + mathScore; //합계계산
		avgScore = (double)sumScore / 2;
		
		
				
		System.out.println("총점");

	}
					
						
}




		
				
				
				
				
				
				
				
				
				
				
				