package stream;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {
	
	public static void main(String[] args) {
		// Arrays 클래스 - 배열을 쉽고 효율적으로 처리하는 기능
		Integer[] num1 = {3, 1, 2, 4, 5};
		
		System.out.println(num1); // 주소가 나옴
		System.out.println(Arrays.toString(num1));
		
		/*for(Integer num : num1)
			System.out.println(num);*/
		
		//Arrays.toString() - 객체 그대로(리스트형) 출력
		System.out.println(Arrays.toString(num1));
		
		// num1의 요소 중 3개 복사 - Arrays.copyOf()
		Integer[] num2 = Arrays.copyOf(num1, 3);
		System.out.println(Arrays.toString(num2));
		
		// 오름차순 정렬 - Arrays.sort()
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		// 오름차순 정렬된 배열을 뒤집기
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
	}

}
