package inheritance.Airplane;

public class Main {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.이륙하다();
		sa.비행하다();
		
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		sa.비행하다();
		
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		sa.비행하다();
		
		sa.착륙하다();

	}

}
