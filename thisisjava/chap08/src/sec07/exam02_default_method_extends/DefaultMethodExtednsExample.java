package sec07.exam02_default_method_extends;

public class DefaultMethodExtednsExample {
	// 구현클래스
	public static void main(String[] args) {
		// 디폴트 메소드를 단순히 상속만 받음
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("ci1-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci1-method3()");
			}
		};
		ci1.method1();
		// ParentInterface의 method2가 호출 됨.
		ci1.method2();
		ci1.method3();
		System.out.println();

		// 디폴트 메소드를 재정의
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("ci2-method1()");
			}

			@Override
			public void method3() {
				System.out.println("ci2-method3()");
			}
		};
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println();

		//디폴트 메소드를 추상 메소드로 재선언
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ci3-method1()");
			}
			@Override
			public void method2() {
				System.out.println("ci3-method2()");
			}
			@Override
			public void method3() {
				System.out.println("ci3-method3()");
			}

			
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();
		System.out.println();

	}

}
