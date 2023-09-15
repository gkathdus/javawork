package inheritance.Person;

public class Main {

	public static void main(String[] args) {
		Engineer seo = new Engineer("우창", 21, 205);
		
		System.out.println("이름: " + seo.getName());
		System.out.println("나이: " + seo.getAge());
		System.out.println("사번: " + seo.getcompanyId());

	}

}
