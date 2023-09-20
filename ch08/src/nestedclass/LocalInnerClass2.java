package nestedclass;

class Out {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runner = new Runnable() {
		int localNum = 20;

		@Override
		public void run() {
			System.out.println(outNum + "(외부클래스의 인스턴스 변수)");
			System.out.println(sNum + "(외부클래스의 정적 변수)");
			System.out.println(localNum + "(외부클래스의 멤버 변수)");
			
		}
		
	};
}

public class LocalInnerClass2 {

	public static void main(String[] args) {

		Out out = new Out();
		out.runner.run();

	}

}
