package sec03.exam01_name_implement_class;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//new�����ڷ� ����Ŭ������ ��ü ����
		//�������̽��� new������ ����� ��ü ���� �Ұ�
		
		//��ü���� ��� 1
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
		
		//��ü���� ��� 2
		RemoteControl tv = new Television();
		RemoteControl audio = new Audio();
	}

}
