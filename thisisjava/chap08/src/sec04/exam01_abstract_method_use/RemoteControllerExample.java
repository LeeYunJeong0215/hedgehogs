package sec04.exam01_abstract_method_use;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//추상 메소드 사용
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
