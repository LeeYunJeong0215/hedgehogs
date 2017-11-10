package sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args){
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성 방법
		A.B b = a.new B();
		//A.B b = new A.B();이렇게 바로 생성자 호출은 불가
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성 방법은 인스턴스 멤버 객체 생성 방법과 다름
		A.C c = new A.C();
		//A.C c = a.new C(); 오류 발생
		c.field1 = 5;
		c.method1();
		//정적 필드와 인스턴스 필드 사용시 A객체 생성이 필요 없음
		A.C.field2 = 5;
		A.C.method2();
		
		a.method();
		
	}

}
