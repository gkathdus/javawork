package polymorphism.fruits;

public class Fruit {
	
	// 필드
	String name; // 과일 이름
	String weight; // 무게(중량)
	int price;
	public Fruit() {}
	
	public void showFruitInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 무게: " + weight);
		System.out.println("과일 가격: " + price);
	}

}
