package sec05.exam02_field_array;

public class Car {
	//인터페이스 타입 필드를 배열로 선언 후 초기구현객체 대입
	Tire[] tires = {
	new HankookTire(),
	new HankookTire(),
	new HankookTire(),
	new HankookTire()
	};

	//인터페이스에서 설명된 roll()메소드 호출
	void run(){
		//향상된 for문을 이용 Tire타입의 tires[] 배열에 tire.roll()호출 대입
		for(Tire tire : tires){
			tire.roll();
		}
	}
}
