package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		School school = School.gerInstance();
		
		Student ham = school.createStudent();
		Student seo = school.createStudent();
		
		System.out.println(": " + ham.getStudentNum());
		System.out.println(": " + seo.getStudentNum());
	}

}
