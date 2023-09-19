package reference.subjects;

public class Subject {
	// 필드
	private String subjectName; // 과목 이름
	private int scorePoint; // 과목 점수
	
	
	// getter, setter
	// 과목 이름 입력
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
		
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}

}
