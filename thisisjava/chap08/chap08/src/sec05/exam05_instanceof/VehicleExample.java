package sec05.exam05_instanceof;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		//Bus 구현 클래스 내의 메소드를 쓰고 싶을 때
		//강제타입변환을 이용
		if(vehicle instanceof Bus){ //vehicle 매개변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
		
		

	}

}
