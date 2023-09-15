package overriding.shop;

public class MainClass2 {

	public static void main(String[] args) {
		// 자동 형변환
		HeadShop shop1 = new Shop1();
		
		shop1.부대찌개();
		
		System.out.println("===========================");
		
		HeadShop shop2 = new Shop2();
		
		shop2.김치찌개();
		
		int iNum = 10;
		double dNum;
		
		dNum = iNum;
		System.out.println(dNum); // 10.0
		
		iNum = (int)dNum;
		System.out.println(iNum);

	}

}
