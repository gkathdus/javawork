package singleton.student;

public class School {
	private static School instance;
	
	private School() {}
	
	public static School gerInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	// 학생 생성 메서드
	public Student createStudent() {
		Student student = new Student();
		return student;
	}

}
