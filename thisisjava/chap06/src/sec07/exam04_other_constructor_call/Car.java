package sec07.exam04_other_constructor_call;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
	}
	
	Car(String model){
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		
		//Car(String model, String color, int maxSpeed) ������ ȣ��
		this(model, null, 0);
		
		//System.out.println("Car(String model)ȣ��");
		/*���� ������ ù ���̸� �����߻� �ֳ��� this() ������ ȣ���� ������
		�� ù�ٿ� ��� ��. ������ ����. �׳� �ڹٰ� �׷��� �������.*/
		
		//�ٵ� ��������� this() �����ε� �� ��½ÿ���
		//�ؿ� ���� System.out.println("Car(String model)ȣ��");
		//���� ���� ��µǴ°���???? �𸣰ڴ�
		System.out.println("Car(String model)ȣ��");
		
	}
	Car(String model, String color){
		/*this.model = model;
		this.color = color;
		this.maxSpeed = 0;*/
		//Car(String model, String color, int maxSpeed) ������ ȣ��
		this(model, color, 0);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	/*�� ���� ������ �����ε��� �ƴ�.(�����߻�)
	�Ű������� �ڷ����� String, int�� ���� ������ �Ȱ��� ������ �Ȱ����Ƿ�
	�Ű������� �̸��� �ٸ� ���� ���� ���谡 ����.
	Car(String color,String model, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}*/
	//�� ���� �����ε��� ����, ������ �ٸ��� ������
	Car(int maxSpeed,String color,String model){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
