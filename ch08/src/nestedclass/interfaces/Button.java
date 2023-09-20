package nestedclass.interfaces;

public class Button {
	// 필드 - 인터페이스형 멤버 변수
	private OnClickListener listenner;
	
	// 내부 인터페이스
	interface OnClickListener {
		public void onClick();
	}
	// 외부에서 구현 객체 입력
	public void setListenner(OnClickListener listenner) {
		this.listenner = listenner;
	}
	
	// 버튼 터치
	public void touch() {
		listenner.onClick();
	}
}
