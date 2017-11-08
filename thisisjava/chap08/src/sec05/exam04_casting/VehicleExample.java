package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//Bus 구현 클래스 내의 메소드를 쓰고 싶을 때
		//강제타입변환을 이용
		
		Bus bus = (Bus)vehicle;
		
		bus.checkFare();

	}

}
