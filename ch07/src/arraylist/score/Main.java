package arraylist.score;

public class Main {

	public static void main(String[] args) {
		// Student 객체 생성
		Student std1 = new Student(101, "서우창");
		
		std1.addSubject("국어", 100);
		std1.addSubject("수학", 95);
		std1.addSubject("Java", 85);
		
		std1.snowStudentInfo();

	}

}
