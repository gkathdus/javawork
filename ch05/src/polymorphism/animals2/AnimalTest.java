package polymorphism.animals2;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
		
	}
}
	
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
		
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 추락합니다.");
	}
	
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		// Animal의 move() 메서드 호출
		// moveAnimal() 호출
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		System.out.println("**** 자식형으로 다운 캐스팅 ****");
		
		// 크기가 3인 animal 인스턴스를 저장할 배열 생성
		Animal[] animals = new Animal[3];
		
		// 자식 객체 생성
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		for(int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Human) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			
			}
		}
		
		
		/*animals[0] = new Human();
		animals[1] = new Tiger();*/
		
		// animal 타입으로 객체 생성
		/*System.out.println("**** 원래형으로 다운 캐스팅 ***");
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		
		// 강제 형변환 instanceof 키워드 사용
			if(human instanceof Human) {
				Human h = (Human)human;
				h.readBook();
			}
			if (tiger instanceof Tiger) {
				Tiger t = (Tiger)tiger;
				t.hunting();
			}
			if (eagle instanceof Eagle) {
				Eagle e = (Eagle)eagle;
				e.flying();
			}*/
		
	}

	
	

}
