package abstracts.aniaml;

public abstract class Animal {
	
	// 필드
	public String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	// 추상 메서드(구현을 안 함, 상속받는 클래스는 필수로 구현해야함)
	// 예를 들면 cry()는 안 되고 sound() 사용하도록 강제
	public abstract void sound();

}
