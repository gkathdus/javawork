package arraylist.dog;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		// Dog 인스턴스를 저장할 리스트 생성
		ArrayList<Dog> dogList = new ArrayList<>();

		// 객체 생성
		Dog dog1= new Dog("백구1", "진돗개");
		Dog dog2= new Dog("백구2", "치와와");
		Dog dog3= new Dog("백구3", "푸들");
		
		// 인스턴스를 저장
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		// 2번 인덱스 출력
		// System.out.println(dogList.get(2));
		
		// 전체 조회
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog);
		}

	}

}
