package sec03.exam02_field_method_access;

//멤버 클래스에서의 사용 제한
public class A {
	int field1;
	void method1(){}
	
	static int field2;
	static void method2(){}
	
	//인스턴스 맴버 클래스(사용 제한 없음)
	class B{
		void method(){
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//정적 멤버 클래스(인스턴스 필드와 메소드는 접근 불가)
	static class C{
		void method(){
			//인스턴스 필드와 메소드는 사용 불가.
			/*field1 = 10;
			method1();*/
						
			field2 = 10;
			method2();
		}
	}

}
