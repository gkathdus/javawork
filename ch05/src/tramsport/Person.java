package tramsport;

// 사람 클래스(자료형)
public class Person {
	String name; // 이름
	int money; // 가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스를 탄다  // class
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
		
	}
	// 지하철을 탄다
	public void takeSubway(Subway subway) {
		subway.take(1350);
		this.money -= 1350;
	}
	
	// 사람의 정보
	public void showPersonInfo() {
		System.out.println(name + "님의 남은 돈은 " +
				money + "원입니다.");
	}

}
