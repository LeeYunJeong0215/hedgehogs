package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		//매개 변수의 다형성 테스트 
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus);
		driver.drive(texi);
	}

}
