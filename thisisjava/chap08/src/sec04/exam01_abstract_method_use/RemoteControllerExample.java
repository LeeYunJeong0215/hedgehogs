package sec04.exam01_abstract_method_use;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//�߻� �޼ҵ� ���
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
