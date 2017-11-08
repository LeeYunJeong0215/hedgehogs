package sec03.exam02_noname_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class RemoteControllerExample {
	public static void main(String[] args){
		//익명 구현 객체
		RemoteControl rc = new RemoteControl(){
			//필드
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
				if(volume>RemoteControl.MAX_VOLUME){
					//this.volume = MAX_VOLUME; 이것도 되긴 하는데 상수가 어려개면 안될듯
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME){
					//this.volume = MIN_VOLUME;
					this.volume = RemoteControl.MIN_VOLUME;
				}else{
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 : " + volume);
			}
		};
		RemoteControl rc2 = new RemoteControl(){
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
		};
	}
}
