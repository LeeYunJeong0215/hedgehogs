package sec05.exam02_field_array;

public class Car {
	//�������̽� Ÿ�� �ʵ带 �迭�� ���� �� �ʱⱸ����ü ����
	Tire[] tires = {
	new HankookTire(),
	new HankookTire(),
	new HankookTire(),
	new HankookTire()
	};

	//�������̽����� ����� roll()�޼ҵ� ȣ��
	void run(){
		//���� for���� �̿� TireŸ���� tires[] �迭�� tire.roll()ȣ�� ����
		for(Tire tire : tires){
			tire.roll();
		}
	}
}
