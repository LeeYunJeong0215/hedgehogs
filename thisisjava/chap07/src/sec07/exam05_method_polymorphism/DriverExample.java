package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Texi texi = new Texi();

		// Driver클래스의 driver메소드에 매개변수로 Bus, Texi 객체를 넣음.
		driver.driver(bus);
		driver.driver(texi);
		// Driver 클래스의 driver 메소드
		// public void driver(Vehicle vehicle){
		// vehicle.run();
		// Bus, Texi에 run메소드가 오버라이딩 했으므로 오버라이딩 메소드가 실행됨.
	}
}
