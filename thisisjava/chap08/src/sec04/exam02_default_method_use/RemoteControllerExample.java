package sec04.exam02_default_method_use;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//����Ʈ �޼ҵ� ���
		//�ν��Ͻ� �޼ҵ� �̹Ƿ� �������̽��� �ٷ� ȣ���� �Ұ���
		//������ü�� �־�� ��� �����ϹǷ� �ڷ����� ��ü�� ���� �� ���
		RemoteControl rc = new Television();
		rc.turnOn();
		//�ν��Ͻ� �޼ҵ� ���
		rc.setMute(true);
		System.out.println("------------------");
		rc = new Audio();
		rc.turnOn();
		//AudioŬ������ ����Ʈ�޼ҵ带 �������� �޼ҵ� ���
		rc.setMute(false);
	}

}
