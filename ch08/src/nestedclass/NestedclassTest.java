package nestedclass;

class A {
	A() {
		System.out.println("A 객체 생성");
	}
	
	class B {
		int field1;
		B(){System.out.println("B 객체 생성");}
		void method1() {}
	}

	
	
	// 내부 정적 멤버 클래스
	static class C {
		int field1;
		static int field2;
		C() {System.out.println("C 객체 생성");}
		
		void method1() {}
		static void method2() {}
	}
	
	// 메서드 내부 로컬 클래스 사용
	void method() {
		class D{
			int field1;
			D() {System.out.println("D 객체 생성");}
			void method1() {};
		}
		// d 객체 생성
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}
public class NestedclassTest {

	public static void main(String[] args) {
		// a 객체 생성
		A a = new A();
		
		// b 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// c 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		A.C.field2 = 3;
		A.C.method2();
		
		// d 클래스의 method 호출
		a.method();
		
	}

}
