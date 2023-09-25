package threads.synchornize;

public class User1Thread extends Thread {
	
	// calculator 참조
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void serCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}

}
