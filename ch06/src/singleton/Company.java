package singleton;

public class Company {
	// 싱글톤 코딩 디자인 패턴 사용
	// 멤버 병수가 객체 인스턴스
	// static을 활용함 - new로 생성하지 않음
	private static Company instancs;
	
	private Company() {}
	
	public static Company getInstance() {
		if(instancs == null) {
			instancs = new Company();
		}
		return instancs;
	}
	
	
		
	}


