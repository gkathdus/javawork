package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Member 클래스를 참조해서 회원 생성, 조회, 삭제하는 클래스
public class MemberHashMap {
	// HashMap 자료 구조 객체 생성
	private Map<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	// 회원 목록 조회
	public void showAllMember() {
		// 인덱싱이 안 됨(순서가 없음) - 반복자(Iterator) 사용
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { // 객체 수만큼 반복
			int key = ir.next(); // 키를 가져옴
			Member member = hashMap.get(key); // 키를 매개로 멤버 객체 가져옴
			System.out.println(member);
		}
	}
	
	// 회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	// 회원의 전체 수
	public int getSize() {
		return hashMap.size();
	}

}
