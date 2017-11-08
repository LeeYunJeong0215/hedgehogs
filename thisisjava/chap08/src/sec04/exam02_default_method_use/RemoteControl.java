package sec04.exam02_default_method_use;

//�������̽�
public interface RemoteControl {
	//����ʵ�, static{}������� �ʱ�ȭ �� �� �����Ƿ� �ݵ�� �ʱⰪ ���� �ʿ�
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�, �޼ҵ� ����θ� �ۼ�(�߰�ȣ�� ������ ����), public
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ �޼ҵ�, ���೻����� �ۼ� ����, public
	default void setMute(boolean mute){
		if(mute){
			System.out.println("����ó�� �մϴ�");
		}else{
			System.out.println("�������� �մϴ�");
		}
	}
	//���� �޼ҵ�, public
	static void changeBettery(){
		System.out.println("�������� �����մϴ�");
	}
	
}
