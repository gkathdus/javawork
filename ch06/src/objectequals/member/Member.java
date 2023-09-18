package objectequals.member;

public class Member {
	private String memberId;
	private String name;
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return memberId.hashCode();
	}
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; // Member형으로 다운 캐스팅
			if(this.memberId.equals(member.memberId)) {
				return true; // 외부 입력된 회원 아이디와 이미 생성된 회원 아이디가 일치하면
			}
		}
		return false;
	}
	
	// 객체의 문자열 정보 - toString() 재정의
	@Override
	public String toString() {
		return memberId + ", " + name;
	}
	
	
	
	
	
	

}
