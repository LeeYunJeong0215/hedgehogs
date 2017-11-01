package sec06.exam01_protected_package1;

public class B {
	public void method(){
		A a = new A();
		//protected 제한자는 같은 패키지에서는 default의 효과를 가짐
		//필드, 생성자, 메소드에 얼마든지 접근 가능.
		a.field = "value";
		a.method();
		
	}
}
