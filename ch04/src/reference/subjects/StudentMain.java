package reference.subjects;

public class StudentMain {

	public static void main(String[] args) {
		/*Student std1 = new Student(101, "함소연");
		Student std2 = new Student(102, "함먕");
		
		// 과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 100);
		std2.koreanSubject("국어", 80);
		std2.mathSubject("수학", 0);
		
		// 학생 정보 출력
		std1.showStudentInfo();
		System.out.println("==========================");
		std2.showStudentInfo();*/
		
		// 객체 배열
		Student[] students = {
			new Student(101, "함소연"),
			new Student(102, "최은호"),
			new Student(102, "김희린")
		};
		
		students[0].koreanSubject("국어", 95);
		students[0].mathSubject("수학", 100);
		students[0].showStudentInfo();
		
		students[1].koreanSubject("국어", 95);
		students[1].mathSubject("수학", 100);
		students[1].showStudentInfo();
		
		students[2].koreanSubject("국어", 95);
		students[2].mathSubject("수학", 100);
		students[2].showStudentInfo();
		
		// 전체 출력
		for(int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}
		System.out.println("==================================");
		
		// 향상 for문
	    for(Student stu: students) {
	    	stu.showStudentInfo();
	    }
		

	}

}
