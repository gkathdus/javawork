package inheritance.statement;

public class SaleStatement {

	public static void main(String[] args) {
		// Drink 클래스 사용
		Drink coffee = new Drink("커피", 4500, 10);
		Drink 녹차 = new Drink("녹차", 3000, 4);
		
		// Alocohol 클래스 사용
		Alocohol 소주 = new Alocohol("참이슬", 5500, 3, 16.5f);
		Alocohol 맥주 = new Alocohol("TERRA", 4500, 10, 4.3f);
		
		// 전표 출력
		Drink.printTitle();
		coffee.printData();
		녹차.printData();
		
		System.out.println("=============================");
		
		// Alocohol 전표 출력
		Alocohol.printTitle();
		소주.printData();
		맥주.printData();
		
		// 총계 출력
		int sumVal = coffee.getTotalprice() + 녹차.getTotalprice() +
				소주.getTotalprice() + 맥주.getTotalprice();
		
		System.out.println("********** 합계 금액 " + sumVal + "원 **********");

	}

}
