package test;

public abstract class Car {
	// 추상 메서드 사용 이유
	// 상속받는 자식클래스에 반드시 구현하도록 제시, 강제함
	public abstract void run();
	
	public abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	

}
