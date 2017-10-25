package sec13.exam02_constructor_access.package1;

public class B {
	//같은 패키지의 클래스 A에서 만든 생성자 호출 
	//private 접근제한자를 사용한 경우만 호출 불가(private는 외부클래스에서는 생성자 호출 불가)
	
	A a1 = new A(true);
	A a2 = new A();
	//A a3 = new A("문자열");(오류발생)
}
