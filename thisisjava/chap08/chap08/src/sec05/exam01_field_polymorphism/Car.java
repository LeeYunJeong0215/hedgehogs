package sec05.exam01_field_polymorphism;

public class Car {
	//인터페이스 타입 필드선언 초기구현객체 대입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backtLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	//인터페이스에서 설명된 roll()메소드 호출
	void run(){
		frontLeftTire.roll();
		frontRightTire.roll();
		backtLeftTire.roll();
		backRightTire.roll();
	}
}
