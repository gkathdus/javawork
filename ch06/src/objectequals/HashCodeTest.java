package objectequals;

class Employee {
	// 필드 - 멤버 변수, 인스턴스 변수
	int empId;  	// 사번
	String empName; // 이름
	
	Employee(int empId, String empName) {
		this.empId = empId; 
		this.empName = empName;
	}
	
	// equals 메서드 재정의
	@Override
	public boolean equals(Object obj) { // 비교하려는 게 크니까...?
		// 논리적으로 문자열이 동일하도록 구현
		if(obj instanceof Employee) { // obj가 employee의 인스턴스라면
			Employee employee = (Employee)obj; // 다운 캐스팅(강제 형변환)
			if(this.empId == employee.empId)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() { // int형이니까 그냥 그대로 쓴다 문자형일 경우는 ~~~hashCode로 바꿔준다
		return empId;
	}
	
	
	
}

public class HashCodeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "함소연");
		Employee emp2 = new Employee(101, "함소연");
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
		// hashCode값 비교
		// 동등 객체인지 확인(문자열의 일치 확인)
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		// 실제 물리 주소
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
		
	}

}
