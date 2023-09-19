package interfacex.sorting;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] numbers) {
		System.out.println("HeapSort ascending");
		
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("HeapSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다");
	}

	

}
