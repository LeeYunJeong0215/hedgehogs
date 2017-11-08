package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControllerExample {
	public static void main(String[] args){
		//�͸� ���� ��ü
		RemoteControl rc = new RemoteControl(){
			//�ʵ�
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�");
			}

			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�");
				
			}

			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME){
					//this.volume = MAX_VOLUME; �̰͵� �Ǳ� �ϴµ� ����� ������� �ȵɵ�
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME){
					//this.volume = MIN_VOLUME;
					this.volume = RemoteControl.MIN_VOLUME;
				}else{
					this.volume = volume;
				}
				System.out.println("���� TV ���� : " + volume);
			}
		};
		RemoteControl rc2 = new RemoteControl(){
			//�ʵ�
			private int volume;
			
			//�������̽��� ��� �޼ҵ�� public ���� �����ڸ� �����Ƿ�
			//�߻�޼ҵ带 ��ü�޼ҵ�� �ۼ��� public �������Ѻ��� ���� ���������� �� �� ����.
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�");
				
			}

			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME){
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME){
					this.volume = RemoteControl.MIN_VOLUME;
				}else{
					this.volume = volume;
				}
				System.out.println("���� Audio ���� : " + volume);
			}
		};
	}
}
