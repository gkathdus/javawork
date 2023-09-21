package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// set 인더페이스를 구현한 HashSet 클래스의 객체 생성
		// 순서가 없고, 중복 데이터를
		Set<String> set = new HashSet<>();
		
		// 객체 생성
		set.add("java");
		set.add("jdbc");
		set.add("Jsp");
		set.add("java"); // 중복으로 저장이 안 됨
		
		// 객체의 수
		System.out.println("총 객체수: " + set.size());
		
		// 객체 삭제
		if(set.contains("Jsp")) {
			set.remove("Jsp");
		}
		
		// 전체 목록 조회
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next(); // 다음 객체가 있으면 가져옴
			System.out.println(element);
		}
			
		// 전체 조회 2
			for(String element : set) {
				System.out.println(element);
			
			System.out.println(set);
		}
		
			
	}


}
