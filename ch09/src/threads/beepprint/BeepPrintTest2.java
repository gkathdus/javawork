package threads.beepprint;

public class BeepPrintTest2 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask();
		
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 1; i <=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 예외 처리하기
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
