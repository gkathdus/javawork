package inheritance.Person;

public class Engineer extends Person {
	int companyId;
	
	public Engineer(String name, int age, int companyId) {
		super(name, age);
		this.companyId = companyId;
	}
	
	public int getcompanyId() {
		return companyId;
	}

}
