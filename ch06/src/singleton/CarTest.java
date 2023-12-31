package singleton;

import singleton.car.Car;
import singleton.car.CarFactory;

public class CarTest {
	// 싱글톤이므로 객체는 1개임
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourMorning = factory.createCar();
		
		System.out.println("신차 번호: " + mySonata.getCarNum());
		System.out.println("신차 번호: " + yourMorning.getCarNum());
	}

}