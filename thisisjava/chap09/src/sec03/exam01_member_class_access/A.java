package sec03.exam01_member_class_access;

//바깥 필드와 메소드에서 사용 제한
public class A {
	class B{} //인스턴스 멤버 클래스
	static class C{} //정적 멤버 클래스

	//인스턴스 필드(제한 없음)
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드(제한없음)
	void method1(){
		B var1 = new B();
		C var2 = new C();
	}
	//정적 필드(정적 멤버 클래스만 객체 생성 가능)
	//static B field3 = new B(); 오류
	static C field4 = new C();
	
	//정적 메소드(역시 정적 멤버 클래스만 메소드 내 객체 생성 가능)
	static void method2(){
		//B var3 = new B();
		C var4 = new C();
	}
}
