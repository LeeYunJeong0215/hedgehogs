package sec04.exam02_default_method_use;

public class RemoteControllerExample {

	public static void main(String[] args) {
		//디폴트 메소드 사용
		//인스턴스 메소드 이므로 인터페이스로 바로 호출이 불가능
		//구현객체가 있어야 사용 가능하므로 텔레비젼 객체를 생성 후 사용
		RemoteControl rc = new Television();
		rc.turnOn();
		//인스턴스 메소드 사용
		rc.setMute(true);
		System.out.println("------------------");
		rc = new Audio();
		rc.turnOn();
		//Audio클래스에 디폴트메소드를 재정의한 메소드 출력
		rc.setMute(false);
	}

}
