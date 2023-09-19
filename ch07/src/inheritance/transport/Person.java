package inheritance.transport;

// 사람 클래스(자료형)
public class Person {
	String name; // 이름
	int money; // 가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 교통수단 이용 메서드(매개변수의 다형성)
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
	}
	
	// 사람의 정보
	public void showPersonInfo() {
		System.out.println(name + "님의 남은 돈은 " +
				money + "원입니다.");
	}

}
