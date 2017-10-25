package sec13.exam02_constructor_access.package1;

public class A {
	//생성자 호출(=생성자를 필드로 선언)
	//같은 클래스내에서는 접근제한자가 무엇이든 생성자 호출 가능.
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");
		
	//접근제한자를 각각 다르게 해서 생성자 생성
	public A(boolean b){}
	A(){}
	private A(String b){}
	
	
}
