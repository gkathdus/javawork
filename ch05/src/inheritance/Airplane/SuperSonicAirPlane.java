package inheritance.Airplane;

public class SuperSonicAirPlane extends AirPlane {
	// 1 - 일반비행, 2 - 초음속 비행
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	int flyMode = NORMAL;
	
	@Override // 매서드 재정의
	public void 비행하다() {
		if(flyMode == SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			super.비행하다();
		}
	}

}
