package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>(); // 컨트롤 쉬프트 영문 o 한꺼번에 임포트됨!
		
		// 객체 저장
		map.put("윤지혜", 95); // key, value
		map.put("서우창", 99);
		map.put("함소연", 100);
		map.put("윤지혜", 90);
		
		// 특정 객체 조회 (키 -> 점수)
		System.out.println(map.get("서우창"));
		
		// 객체 삭제
		if(map.containsKey("윤지혜")) { // 객체가 map에 포함되어있다면
			map.remove("윤지혜"); // 키도 삭제 -> 값도 삭제
		}
		
		// 총 객체수
		System.out.println("총 객체수: " + map.size());
		
		// 전체 조회
		Set<String> keySet = map.keySet(); // key값 객체를 생성
		Iterator<String> ir = keySet.iterator(); // 키값으로 반복할 반복자 객체 생성
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		// 조회 2
		for(String key : keySet) {
			System.out.println(key + ": " + map.get(key));
		
		}
		
		// 객체 자체를 출력 - {key=value}
		System.out.println(map);

	}

}
