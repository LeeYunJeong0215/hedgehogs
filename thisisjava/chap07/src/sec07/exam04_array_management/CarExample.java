package sec07.exam04_array_management;

public class CarExample {
	public static void main(String[] args){
	Car car = new Car();
	
	for(int i=1; i<=5; i++){
		int problemLocation = car.run();
		if(problemLocation != 0){
			System.out.println(car.tires[problemLocation-1].location + 
					"HankookTire�� ��ü");
			car.tires[problemLocation - 1] =
					new HankookTire(car.tires[problemLocation - 1].location, 15);
		}
		/*switch(problemLocation){
			case 1:
				//car��ü�� Tire�ʵ忡 HankookTire��ü ����(��, �ڵ�Ÿ�Ժ�ȯ)	
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				//car��ü�� Tire�ʵ忡 HankookTire��ü ����(��, �ڵ�Ÿ�Ժ�ȯ)	
				car.frontRightTire = new HankookTire("�տ�����", 13);
				break;
			case 3:
				//car��ü�� Tire�ʵ忡 KumhoTire��ü ����(��, �ڵ�Ÿ�Ժ�ȯ)	
				car.backLeftTire = new KumhoTire("�ڿ���", 14);
				break;
			case 4:
				//car��ü�� Tire�ʵ忡 KumhoTire��ü ����(��, �ڵ�Ÿ�Ժ�ȯ)	
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			
		}*/
		System.out.println("------------------------------------------");
	}
	
	}
}
