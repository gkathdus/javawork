package Arrays;

public class FindMaxValue {

	public static void main(String[] args) {
		// 배열에서 최대값 찾기
		// 1. 최대값(maxVal) 설정 - 0번 인덱스
		// 2. 전체를 반복하면서 배열의 값과 최대값과 비교해서
		//    최대값보다 크면 그 값을 최대값으로 변경
		int[] arr = new int[] {1, 5, 8, 3, 2};
		int maxVal = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		    //최대값 출력
			
		}
		System.out.println("최대값 : " + maxVal);
	}

}
