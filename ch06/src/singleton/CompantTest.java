package singleton;

public class CompantTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println(company1 == company2); // true임
	}

}
