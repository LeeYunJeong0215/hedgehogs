package sec05.exam01_field_polymorphism;

public class Car {
	//�������̽� Ÿ�� �ʵ弱�� �ʱⱸ����ü ����
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backtLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	//�������̽����� ����� roll()�޼ҵ� ȣ��
	void run(){
		frontLeftTire.roll();
		frontRightTire.roll();
		backtLeftTire.roll();
		backRightTire.roll();
	}
}
