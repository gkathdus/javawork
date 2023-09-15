package reference.subject2;

public class StudentTest {

	public static void main(String[] args) {
		Student ham = new Student(101, "함소연");
		Student seo = new Student(102, "서우창");
		
		ham.addSubject("국어", 100);
		ham.addSubject("수학", 100);
		ham.addSubject("과학", 95);
		ham.showStudentInfo();
		
		System.out.println("=================================");
		
		seo.addSubject("코딩", 95);
		seo.addSubject("자바", 100);
		seo.showStudentInfo();

	}

}
