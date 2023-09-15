package reference.circle;

// point 자료형 생성
public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPointInfo() {
		System.out.println("점(" + x + ", " + y + ")");
	}
}
