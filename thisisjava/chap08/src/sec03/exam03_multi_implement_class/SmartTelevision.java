package sec03.exam03_multi_implement_class;
//���� �������̽� ���� Ŭ����
public class SmartTelevision implements RemoteControl, Searchable {
	// �ʵ�
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
		if (volume > RemoteControl.MAX_VOLUME) {
			// this.volume = MAX_VOLUME; �̰͵� �Ǳ� �ϴµ� ����� ������� �ȵɵ�
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// this.volume = MIN_VOLUME;
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�");
	}
	
}
