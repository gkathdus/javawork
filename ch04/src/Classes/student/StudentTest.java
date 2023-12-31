package Classes.student;

public class StudentTest {

	public static void main(String[] args) {
		// student 객체(변수) 생성
		// 메모리 영역(new 를 하면 heap 영역 사용)
		// 점 연산자로 접근함
		Student student1 = new Student();
		student1.name = "함소연";
		student1.studentid = 101;
		student1.grade = 1;
		student1.showStudentInfo();
		
		/*System.out.println("이름: " + student1.name);
		System.out.println("학번: " + student1.studentid);
		System.out.println("학년: " + student1.grade);*/
		
		System.out.println("=====================================");
		
		Student student2 = new Student();
		student2.name = "함민재";
		student2.studentid = 102;
		student2.grade = 2;
		student2.showStudentInfo();
		
		/*System.out.println("이름: " + student2.name);
		System.out.println("학번: " + student2.studentid);
		System.out.println("학년: " + student2.grade);*/

	}

}
