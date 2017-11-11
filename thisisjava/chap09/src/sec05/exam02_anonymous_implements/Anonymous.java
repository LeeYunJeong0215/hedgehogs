package sec05.exam02_anonymous_implements;
//익명 구현 클래스와 객체 생성
public class Anonymous {
	//1. 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다");
			
		}
	};
	
	//2 로컬 변수 값으로 대입
	void method1(){
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다");
				
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	//3.메소드 호출 시 익명구현객체를 매개변수로 사용하기 위한 메소드 정의
	void method2(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	}
}
