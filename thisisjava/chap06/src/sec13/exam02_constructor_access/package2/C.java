package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class C {
	//다른 패키지에 A class의 생성자 호출
	//public 외의 접근제한자를 가진 생성자는 모두 컴파일 에러 발생.
	A a1 = new A(true);
	//A a2 = new A();
	//A a3 = new A("문자열");
}
