package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//�߻� Ŭ�����̹Ƿ� new�����ڸ� �̿��� ��ü�� ����°� �Ұ���.
		//Phone phone = new Phone();
		
		//�ڽİ�ü�� �����Ͽ� �θ�ü�� �ҷ����°� ����.
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		
		smartphone.turnOn();
		smartphone.InternetSearch();
		smartphone.turnOff();
	}

}
