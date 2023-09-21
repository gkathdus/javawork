package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// MemberArrayList 클래스의 객체 생성
		MemberArrayList memberList = new MemberArrayList();
		
		// Member 객체 생성
		Member mem1 = new Member(1001, "함소연");
		Member mem2 = new Member(1002, "서우창");
		Member mem3 = new Member(1003, "윤지혜");
		Member mem4 = new Member(1003, "윤지혜");
		
		// 회원 추가 메서드 호출
		memberList.addMember(mem1);
		memberList.addMember(mem2);
		memberList.addMember(mem3);
		memberList.addMember(mem4);
		
		// 회원 삭제
		memberList.removeMember(1003);
		memberList.removeMember(1004);
		
		// 회원 객체의 수
		System.out.println("총 객체수: " + memberList.getSize());
		
		// 회원 목록 조회
		memberList.showAllMember();

	}

}
