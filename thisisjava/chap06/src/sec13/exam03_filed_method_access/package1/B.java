package sec13.exam03_filed_method_access.package1;

public class B {
	// 필드와 메소드 호출을 위해 B class의 생성자를 만들고 그 안에 new 생성자로 객체 생성
	// 다른 클래스의 필드와 메소드를 사용하려면 객체 생성이 필요함.
	public B() {
		//같은 패키지의 다른 클래스에서는 private 접근제한자 외에는 제한없이 사용 가능
		A a = new A();
		// 필드 값 변경
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;
		// 메소드 호출
		a.method1();
		a.method2();
		//a.method3();
	}
}
