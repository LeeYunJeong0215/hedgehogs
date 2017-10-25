package sec13.exam03_filed_method_access.package2;

import sec13.exam03_filed_method_access.package1.A;

public class C {
	// 필드와 메소드 호출을 위해 B class의 생성자를 만들고 그 안에 new 생성자로 객체 생성
	// 다른 클래스의 필드와 메소드를 사용하려면 객체 생성이 필요함.
	public C() {
		// 다른 패키지의 다른 클래스에서는 public 접근제한자 외에는 사용 불가.
		A a = new A();
		// 필드 값 변경
		a.field1 = 1;
		/*a.field2 = 1;
		a.field3 = 1;*/
		// 메소드 호출
		a.method1();
		/*a.method2();
		a.method3();*/
	}
}
