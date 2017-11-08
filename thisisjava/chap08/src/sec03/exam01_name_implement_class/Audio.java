package sec03.exam01_name_implement_class;
//구현클래스
public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	//인터페이스의 모든 메소드는 public 접근 제한자를 가지므로
	//추상메소드를 실체메소드로 작성시 public 접근제한보다 낮은 접근제한을 쓸 수 없다.
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
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
		System.out.println("현재 Audio 볼륨 : " + volume);
	}

}
