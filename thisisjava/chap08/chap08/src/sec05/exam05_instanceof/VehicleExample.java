package sec05.exam05_instanceof;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		//Bus ���� Ŭ���� ���� �޼ҵ带 ���� ���� ��
		//����Ÿ�Ժ�ȯ�� �̿�
		if(vehicle instanceof Bus){ //vehicle �Ű������� �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
		
		

	}

}
