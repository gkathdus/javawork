package stream.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		// 고객을 저장할 자료 구조 - ArrayList : customerList
		List<Customer> customerList = new ArrayList<>();
		
		// 고객 객체 생성
		Customer ham = new Customer("함소연", 20, 100);
		Customer seo = new Customer("서우창", 20, 100);
		Customer yoon = new Customer("윤지혜", 19, 50);
		
		// 자료 저장(추가)
		customerList.add(ham);
		customerList.add(seo);
		customerList.add(yoon);
		
		System.out.println("=== 고객 명단 출력 ===");
		
		/*for(Customer customer : customerList)
			System.out.println(customer.getName());*/
		
		// Stream과 람다식을 사용
		Stream<Customer> stream = customerList.stream();
		stream.map(c -> c.getName())
			.forEach(s -> System.out.println(s));
		
		int total = customerList.stream()
				.mapToInt(c -> c.getPrice())
				.sum();
		
		System.out.println("총 여행 비용은 " + total + "만 원입니다.");
		
		System.out.println("=== 나이가 20세 이상인 고객의 명단 정렬하여 출력 ===");
		// filter(), map(), sorted(), forEach()
		customerList.stream()
					.filter(c -> c.getAge() >= 20)
					.map(c -> c.getName())
					.sorted()
					.forEach(s -> System.out.print(s));

	}

}
