package Classes.student;

// 참조(래퍼런스) 자료형
public class Student { // 설계도
	// 클래스 내부에서는 변수를 필드라고 함(필드 - field)
	String name; // 학생 이름("함소연")
	int studentid; // 학번(101)
	int grade; // 학년
	
	// 함수가 아니므로 반환형이 없음
	// 클래스 이름과 같음
	// 기본 생성자는 생략(매개변수 없는 생성자)는 생략 가능 (컴파일러가 자동 생성함)
	public Student() {}  // 기본 생성자
	
	//  학생의 정보를 출력하는 메서드(함수) 정의
	public void showStudentInfo( ) {
		System.out.println("이름: " + name + 
				", 학번: " + studentid + ", 학년: " + grade);
	}
	

}
