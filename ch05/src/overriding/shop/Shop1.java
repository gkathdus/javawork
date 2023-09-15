package overriding.shop;

public class Shop1 extends HeadShop {
	
	public Shop1() {
		System.out.println("역세권 매장입니다.");
	}

	@Override // 마우스 우클릭 -> 소스 -> 오버라이드 -> 오키
	public void 된장찌개() {
		System.out.println("된장찌개: 9,000원");
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개: 8,500원");
	}

	@Override
	public void 부대찌개() {
		System.out.println("부대찌개: 10,000원");
	}
	
	

}
