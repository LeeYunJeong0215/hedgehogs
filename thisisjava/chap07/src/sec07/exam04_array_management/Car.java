package sec07.exam04_array_management;

public class Car {

	Tire[] tires = { new Tire("�տ���", 6), new Tire("�տ�����", 2), new Tire("�ڿ���", 3), new Tire("�ڿ�����", 4) };
	/*
	 * //�ʵ�(���� 4��) 
	 * Tire frontLeftTire = new Tire("�տ���", 6); 
	 * Tire frontRightTire = new Tire("�տ�����", 2); 
	 * Tire backLeftTire = new Tire("�ڿ���", 3);
	 * Tire backRightTire = new Tire("�ڿ�����", 4);
	 */

	// ������
	Car() {
		System.out.println("Car ��ü ����");
	}

	// �޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1); // �ش���ġ�� Ÿ�̾� ��ȣ ����
			}
		}
		/*if(frontLeftTire.roll() == false){
			stop();
			return 1; //�ش���ġ�� Ÿ�̾� ��ȣ ����
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
		System.out.println("[�ڵ����� ����ϴ�]");
	}
}
