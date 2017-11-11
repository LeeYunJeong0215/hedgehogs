package sec05.exam02_anonymous_implements;
//�͸� ���� Ŭ������ ��ü ����
public class Anonymous {
	//1. �ʵ� �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("������ �մϴ�");
		}
		
		@Override
		public void turnOff() {
			System.out.println("������ ���ϴ�");
			
		}
	};
	
	//2 ���� ���� ������ ����
	void method1(){
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�");
				
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//3.�޼ҵ� ȣ�� �� �͸�����ü�� �Ű������� ����ϱ� ���� �޼ҵ� ����
	void method2(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	}
}
