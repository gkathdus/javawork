package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		
		// Bus 객체 생성
		Bus bus100 = new Bus("bus100");
		
		// Taxi 객체 생성
		KakaoTaxi taxi = new KakaoTaxi("카택");
		
		
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		bus100.showInfo();
		
		System.out.println("===========================");
		
		sohee.take(taxi, 4000);
		daeho.take(taxi, 4000);
		
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		taxi.showInfo();

	}

}
