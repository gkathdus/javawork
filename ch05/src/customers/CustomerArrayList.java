package customers;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer lee = new Customer(10010, "이재용");
		Customer shin = new Customer(10020, "신재용");
		Customer hong = new GoldCustomer(10030, "홍준표");
		Customer youl = new GoldCustomer(10040, "율곡이이");
		Customer king = new VIPCustomer(10050, "킹콩", 1004);
		
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
		
		// 상품구매
		int price = 10000;
		
		// 고객 정보 출력
		for(int i = 0; i < customerList.size(); i++) {
			Customer customer = customerList.get(i);
			
			// 보너스 적립금 계산
			int cost = customer.calcPrice(price);
			System.out.printf("%s님이 지불할 비용은 %d원입니다.",
					customer.getCustomerName(), cost);
			System.out.println(customer.showCustomerInfo());
			
		}

	}
	
	

}
