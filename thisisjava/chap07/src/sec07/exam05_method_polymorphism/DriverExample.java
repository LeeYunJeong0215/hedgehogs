package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Texi texi = new Texi();

		// DriverŬ������ driver�޼ҵ忡 �Ű������� Bus, Texi ��ü�� ����.
		driver.driver(bus);
		driver.driver(texi);
		// Driver Ŭ������ driver �޼ҵ�
		// public void driver(Vehicle vehicle){
		// vehicle.run();
		// Bus, Texi�� run�޼ҵ尡 �������̵� �����Ƿ� �������̵� �޼ҵ尡 �����.
	}
}
