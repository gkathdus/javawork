package tramsport;

public class Bus {
	// 필드
	int busNumber; // 버스 번호
	int passenger; // 승객
	int money; // 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 승객을 태우다
	public void take(int fee) { // 요금을 받음
		this.money += fee;
		passenger++; // 승객수 1명 증가
	}
	
	// 버스의 정보
	public void showBusInfo() {
		System.out.printf("%d번 버스의 수입은 %,d원이고, 승객수는 %d명입니다.\n",
				busNumber, money, passenger);
	}

}
