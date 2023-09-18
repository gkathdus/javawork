package abstracts.shop;

public class shop1 extends HeadShop {
	
	public shop1() {
		System.out.println("대학가 매장입니다.");
	}

	@Override
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
