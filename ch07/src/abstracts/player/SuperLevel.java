package abstracts.player;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("zonna 빨라");
		
	}

	@Override
	public void jump() {
		System.out.println("zonna 높이 뛰어");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 가능");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고수래~");
		
	}

}
