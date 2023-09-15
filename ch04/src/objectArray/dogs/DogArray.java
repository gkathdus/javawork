package objectArray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴트 4개를 생성해서 배열에 저장하고
		// 정보를 출력(get() 함수 사용)
		Dog[] dogs = new Dog[4];
		
		dogs[0] = new Dog("먕", "시바견");
		dogs[1] = new Dog("멍", "치와와");
		dogs[2] = new Dog("밍구리", "닥스훈트");
		dogs[3] = new Dog("먀먕", "웰시코기");
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].getName() + ", "
					+ dogs[i].gettype());
		}
		System.out.println("=========================");
		
		// 향상된 for문
		for(Dog dog : dogs) {
			System.out.println(dog.getName() + ", "+ dog.gettype());
		}
	
	    
		

	}

}
