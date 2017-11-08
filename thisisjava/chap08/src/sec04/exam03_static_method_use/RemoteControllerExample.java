package sec04.exam03_static_method_use;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//정적메소드 호출(static 리턴타입 메소드명(매개변수) {})
		//인터페이스로 바로 호출 가능.
		RemoteControl.changeBettery();
	}

}
