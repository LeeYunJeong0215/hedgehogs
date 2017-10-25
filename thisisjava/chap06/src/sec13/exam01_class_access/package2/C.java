package sec13.exam01_class_access.package2;

import sec13.exam01_class_access.package1.B;

public class C {
	//A a; class A를 필드로 선언 불가
	//다른 패키지에 있고, 접근제한자가 default이므로
	
	//class B는 접근제한자가 public이므로 import만 해주면 접근 가능.
	B b;
}
	
