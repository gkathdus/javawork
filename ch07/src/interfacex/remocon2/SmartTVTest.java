package interfacex.remocon2;

import interfacex.remocon.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		// 구현 객체(인스턴스) - tv
		SmartTV tv = new SmartTV();
		
		// 구현 인스턴스를 인터페이스 타입에 저장(자동형변환)
		RemoteControl rc = tv;
		Searchble searchble = tv;
		
		rc.turnOn();
		rc.setVolume(8);
		searchble.search("www.naver.com");
		rc.setMute(true);
		rc.trunOff();
		
		rc.trunOff();
		
		RemoteControl.changeBattery();

	}

}
