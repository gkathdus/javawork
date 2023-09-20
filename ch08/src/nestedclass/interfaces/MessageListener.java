package nestedclass.interfaces;

//"문자를 보냅니다" 인터페이스 구현하기
public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
		
	}

}
