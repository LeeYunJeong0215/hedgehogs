package sec06.exam02_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A{
	//protected 제한자는 상속을 통해 필드, 생성자, 메소드에 접근이 가능하다
	//그러나 new 연산자를 사용할 수는 없고, super()로 생성자를 호출해서 상속받아 사용이 가능하다.
	public D(){
		super();
		this.field = "value";
		this.method();
	}
}
