package enums;

public class SeasonTest {

	public static void main(String[] args) {
		
		Season season;
		
		season = Season.가을; // 클래스 이름으로 접근 // 초기화
		// System.out.println(season);
		
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다");

	}

}
