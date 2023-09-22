package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		// 회원 추가
		memberMap.addMember(new Member(1001, "함소연"));
		memberMap.addMember(new Member(1002, "서우창"));
		memberMap.addMember(new Member(1003, "윤지혜"));
		// 키는 중복 불허, 값은 변경됨
		memberMap.addMember(new Member(1002, "서우창"));
		
		System.out.println("총 객체수: " + memberMap.getSize());
		
		// 회원 삭제
		memberMap.removeMember(1003);
		System.out.println("총 객체수: " + memberMap.getSize());
		
		// 회원 목록
		memberMap.showAllMember();

	}

}
