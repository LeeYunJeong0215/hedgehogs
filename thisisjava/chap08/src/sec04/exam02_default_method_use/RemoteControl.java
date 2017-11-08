package sec04.exam02_default_method_use;

//인터페이스
public interface RemoteControl {
	//상수필드, static{}블록으로 초기화 할 수 없으므로 반드시 초기값 대입 필요
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드, 메소드 선언부만 작성(중괄호를 붙이지 않음), public
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드, 실행내용까지 작성 가능, public
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음처리 합니다");
		}else{
			System.out.println("무음해제 합니다");
		}
	}
	//정적 메소드, public
	static void changeBettery(){
		System.out.println("건전지를 구현합니다");
	}
	
}
