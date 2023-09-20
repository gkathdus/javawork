package arraytest;

public class ArrayTest {
	
	public static int add(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			// System.out.println(numbers[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int result = add(numbers);
		
		System.out.println(result);
		
		// System.out.println(numbers[2]);

	}

}
