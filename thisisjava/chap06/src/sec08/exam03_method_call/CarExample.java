package sec08.exam03_method_call;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.keyTrunOn();
		myCar.run();
		int speed = myCar.getspeed();
		System.out.println("����ӵ� : " + speed + "km/h");

	}

}
