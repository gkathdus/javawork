package test;

public class CarTest {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autocar = new AutoCar();
		
		bus.run(); // 객체의 메서드(함수) 호출
		autocar.run();
		
		bus.refuel();
		autocar.refuel();
		
		bus.takePassenger();
		autocar.takePassenger();
		
		bus.stop();
		autocar.stop();

	}

}
