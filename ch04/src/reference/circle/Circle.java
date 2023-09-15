package reference.circle;

public class Circle {
	Point center;
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y); // centwr 객체 생성
		this.radius = radius;
	}
	
	public void showCircleInfo() {
		System.out.println("원의 중심은(" + center.x + ", " + center.y + ")이고, 반지름은"
				+ radius + "입니다");
	}

}
