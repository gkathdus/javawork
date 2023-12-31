package inheritance.statement;

public class Drink {
	protected String name;
	protected int price;
	protected int count;
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalprice() {
		// 금액은 가격 * 수량
		return price * count;
	}
	
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
		
	}
	
	public void printData() {
		System.out.println(name + " " + "\t" + price + "\t"
				+ count + "\t" + getTotalprice());
	}

}
