package sec13.exam03_filed_method_access.package1;

public class A {
	//각각 접근제한자를 다르게 해서 필드 생성
	public int field1;
	int field2;
	private int field3;
	
	//각각 접근제한자를다르게 해서 메소드 생성
	public void method1(){}
	void method2(){}
	private void method3(){}
	
	//생성자 생성
	public A(){
		//필드 값 변경
		field1 = 1;
		field2 = 1;
		field3 = 1;
		//메소드 호출
		method1();
		method2();
		method3();
	//같은 패키지 같은 클래스내에서 생성한 필드와 메소드는 접근에 아무 제한이 없다.
	}

}
