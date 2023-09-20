package nestedclass.interfaces;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		// 전화 걸기 객체 생성
		CallListener call = new CallListener();
		
		button.setListenner(call);
		button.touch();
		
		// 문자 보내기 구현
		button.setListenner(new MessageListener());
		button.touch();
		
		// 사진 찍기 구현
		button.setListenner(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		button.touch();
		

	}

}
