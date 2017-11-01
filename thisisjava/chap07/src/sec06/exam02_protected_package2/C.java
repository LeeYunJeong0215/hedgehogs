package sec06.exam02_protected_package2;

import sec06.exam01_protected_package1.A;

public class C {
	public void method(){
		//protected 접근제한자는 default와 마찬가지로 다른 패키지에서는 쓰일 수 없음.
		/*A a = new A();
		a.field;
		a.method;
		*/
	}
}
