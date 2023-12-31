package customers;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 일반 고객 1명, vip 고객 1명
		Customer lee = new Customer();
		
		// 입력
		lee.setCustomerId(1001);
		lee.setCustomerName("함소연");
		
		int price = 10000;
		lee.calcPrice(price);
		
		// 출력
		System.out.println(lee.showCustomerInfo());
		System.out.println("====================");
		
		VIPCustomer woo = new VIPCustomer();
		
		woo.setCustomerId(1010);
		woo.setCustomerName("서우창");
		woo.setAgentId(7777);
		
		price = 20000;
		woo.calcPrice(price);
		
		System.out.println(woo.showCustomerInfo());

	}

}
