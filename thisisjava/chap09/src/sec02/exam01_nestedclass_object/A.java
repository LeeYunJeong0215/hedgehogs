package sec02.exam01_nestedclass_object;

public class A {

	// 생성자
	A() {
		System.out.println("A 객체가 생성됨");

		// 내부에서 중첩클래스를 사용하고 싶을 때는 객체만 생성하면 됨.
		B b = new B();
		b.field1 = 3;
		b.method1();
	}

	// 중첩클래스(4가지)

	// 1.인스턴스 멤버 클래스 : static 키워드 사용 불가
	class B {
		int field1;

		// static int field2;
		B() {
			System.out.println("B 객체가 생성됨");
		}

		void method1() {
		}
		// static void method2(){}
	}

	// 2.정적 멤버 클래스 : static 필드, 메소드 모두 사용 가능
	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C 객체가 생성됨");
		}

		void method1() {
		}

		static void method2() {
		}

	}

	// 3.로컬 클래스 : static 및 접근제한자(public, private) 사용 불가
	// method를 벗어나서 사용 불가하므로(=외부 사용 불가)
	void method(){
		class D{
			int field1;
			//static int field2; 오류
			D(){
				System.out.println("D 객체가 생성됨");
			}
			void method1(){}
			//static void method2(){}오류
		}
		//로컬클래스는 method를 벗어나서 사용이 불가하므로 
		//그냥 객체를 생성하면 됨.
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
