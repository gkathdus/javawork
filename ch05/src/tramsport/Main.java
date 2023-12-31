package tramsport;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("김태형", 10000);
		Person p2 = new Person("전정국", 20000);
		
		// 버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus5531 = new Bus(5531);
		
		// 지하철 객체 생성
		Subway blue = new Subway("1호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.takeBus(bus5531);
		p2.takeBus(bus5531);
		
		p1.takeSubway(blue);
		p2.takeSubway(blue);
		
		// 정보 출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		System.out.println("==============================");
		bus100.showBusInfo();
		bus5531.showBusInfo();
		System.out.println("==============================");
		blue.showSubwayInfo();
		

	}

}
