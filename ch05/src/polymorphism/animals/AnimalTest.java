package polymorphism.animals;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("소연이가 날아다닌다");
	}
	
	/*public void move() {
		System.out.println("소연이가 날아다닌다");
	}*/
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 날아간다잖아");
	}
	
	/*public void move() {
		System.out.println("독수리가 날아간다잖아");
	}*/
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("우창이 궁디 터뜨리기");

	}
	
	/*public void move() {
		System.out.println("호랑이 달려온다");
	}*/
}


public class AnimalTest {
	
	// move Animal() 정의 - 매개변수의 다형성
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		// AnimalTest 객체 생성
		AnimalTest aTest = new AnimalTest();
		
		// Animal 타입으로 객체 생성(다형성)
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger(); 
		
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(tiger);

	}

}
