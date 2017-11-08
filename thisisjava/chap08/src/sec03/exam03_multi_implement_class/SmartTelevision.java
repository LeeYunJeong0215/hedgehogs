package sec03.exam03_multi_implement_class;
//다중 인터페이스 구현 클래스
public class SmartTelevision implements RemoteControl, Searchable {
	// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			// this.volume = MAX_VOLUME; 이것도 되긴 하는데 상수가 어려개면 안될듯
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			// this.volume = MIN_VOLUME;
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}
	
}
