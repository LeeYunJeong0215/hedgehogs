package sec05.exam02_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		
		//로컬변수를 익명구현객체로 사용한 메소드 호출
		anony.method1();
		
		//메소드 호출 시 익명 구현 객체를 매개값으로 사용
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTv을 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTv을 끕니다");
				
			}
		});

	}

}
