package sec07.exam04_array_management;

public class Car {

	Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };
	/*
	 * //필드(바퀴 4개) 
	 * Tire frontLeftTire = new Tire("앞왼쪽", 6); 
	 * Tire frontRightTire = new Tire("앞오른쪽", 2); 
	 * Tire backLeftTire = new Tire("뒤왼쪽", 3);
	 * Tire backRightTire = new Tire("뒤오른쪽", 4);
	 */

	// 생성자
	Car() {
		System.out.println("Car 객체 생성");
	}

	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1); // 해당위치의 타이어 번호 리턴
			}
		}
		/*if(frontLeftTire.roll() == false){
			stop();
			return 1; //해당위치의 타이어 번호 리턴
		}else if(frontRightTire.roll() == false){
			stop();
			return 2;
		}else if(backLeftTire.roll() == false){
			stop();
			return 3;
		}else if(backRightTire.roll() == false){
			stop();
			return 4;
		}*/
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
}
