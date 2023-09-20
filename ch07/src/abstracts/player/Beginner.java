package abstracts.player;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 빨리 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("점프 앙대");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 앙대");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자래 ㅋㅋ");
		
	}

}
