package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//private ���������ڸ� ���� �ʵ��̹Ƿ� ���� ���� �Ұ�
		//System.out.println(myCar.speed);
		//System.out.println(myCar.stop);
		
		myCar.setSpeed(60);
		myCar.setStop(false);
		
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		
		//getter()�� setter()�� ���� ���� �����ָ� private��
		//���� �ǹ̰� ����. ���� �а� �ٲٴ°� �����ӱ� �����̴�.
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("����ӵ� : " + myCar.getSpeed());
		
		//����
		if(!myCar.isStop()){//isStop()���ϰ��� false�� ���
			myCar.setStop(true);
		}
		
		System.out.println("����ӵ� : " + myCar.getSpeed());
	}

}
