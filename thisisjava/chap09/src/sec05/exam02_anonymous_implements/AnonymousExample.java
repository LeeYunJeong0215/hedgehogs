package sec05.exam02_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		anony.field.turnOff();
		
		//���ú����� �͸�����ü�� ����� �޼ҵ� ȣ��
		anony.method1();
		
		//�޼ҵ� ȣ�� �� �͸� ���� ��ü�� �Ű������� ���
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTv�� �մϴ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTv�� ���ϴ�");
				
			}
		});

	}

}
