package threads.synchornize;

public class User2Thread extends Thread {
	
	// calculator 참조
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void serCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}

}
