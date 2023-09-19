package inheritance.transport;

public class Vehicle {
	
	String vehicleName;
	int money;
	int passengerCount;
	
	// 생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;

	}
	
	// 메서드
	public void carry(int fare) {
		this.money += fare;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("%s의 수입은 %,d원이고, 승객 수는 %d명입니다.\n",
				vehicleName, money, passengerCount);
	}

}
