package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//Bus ���� Ŭ���� ���� �޼ҵ带 ���� ���� ��
		//����Ÿ�Ժ�ȯ�� �̿�
		
		Bus bus = (Bus)vehicle;
		
		bus.checkFare();

	}

}
