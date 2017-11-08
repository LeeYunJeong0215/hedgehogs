package sec03.exam01_name_implement_class;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//new연산자로 구현클래스의 객체 생성
		//인터페이스는 new연산자 사용해 객체 생성 불가
		
		//객체생성 방법 1
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
		
		//객체생성 방법 2
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
	}

}
