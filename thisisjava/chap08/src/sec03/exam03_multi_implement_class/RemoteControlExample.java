package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args){
		SmartTelevision tv = new SmartTelevision();
		//인터페이스 변수에 대입 가능.
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		Searchable searchable = tv;
		searchable.search("http://www.naver.com");
	}
}
