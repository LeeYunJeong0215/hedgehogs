package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//���� ����
		myCar.setGas(5);
		//gasState��� ������ myCar.isLeftGas()�� ���ϰ� ����.
		boolean gasState = myCar.isLeftGas();
		if(gasState){//gasState�� true�̸� ����
			System.out.println("����մϴ�");
			myCar.run();
		}
		if(myCar.isLeftGas()){//if ���ǹ��� �̷��� �־��൵ �ȴ�.
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		}else{
			System.out.println("gas�� �����ϼ���");
		}
	}

}
