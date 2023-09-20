package abstracts.template;

public class AiCar extends Car {

	@Override // 구현
	public void drive() {
		System.out.println("차량이 자율 주행합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다");
		
	}

}
