package sec07.exam03_constructor_overloading;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car(){
	}
	
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this.model = model;
		this.color = color;
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
