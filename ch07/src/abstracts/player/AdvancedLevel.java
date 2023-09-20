package abstracts.player;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달린다");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 점프 가능");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 앙대");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자래~");
		
	}

}
