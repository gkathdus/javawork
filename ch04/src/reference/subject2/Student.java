package reference.subject2;

import reference.subjects.Subject;

public class Student {
	// 필드
	private int studentId;
	private String studentName;
	
	private Subject[] subjects;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10]; // 과목을 저장할 배열의
		
	}
	
	// 과목 추가
	public void addSubject(String name, int score) {
		// 과목 객체를 생성해서 값(과목이름, 점수)을 저장
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		// 과목을 배열에 저장
		// subjects[0] = subject; // 1개 저장
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) {
			subjects[i] = subject; // 배열 객체를 저장
			break; // 빠져나옴
			}
		}
	}
	// 학생 정보를 출력
	public void showStudentInfo() {
		int total = 0; // 총점
		double average; // 평균
		int count = 0; // 개수
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] != null) {
				Subject subject = subjects[i]; // 객체를 생성하고 출력
				count++;
				total += subject.getScorePoint();
				
			System.out.println(studentId +"번 학생 " + studentName + "의 " +
			subject.getSubjectName() + " 점수는 " + subject.getScorePoint() + "점입니다.");
			}
		}
		average = (double)total / count; // 평균 = 총점 / 개수
		System.out.printf("과목의 총점 %d점이고, 평균은 %.1f입니다.\n", total, average);

	}

}
