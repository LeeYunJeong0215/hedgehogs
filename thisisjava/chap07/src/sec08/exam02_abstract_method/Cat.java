package sec08.exam02_abstract_method;

//public class Dog extends Animal{ }�� ����� ���� �߻�
//�ڽ�Ŭ������� �ݵ�� �������̵� �ؾ��ϴ� �߻�޼ҵ带 �������̵� ���� �ʾұ� ����.
public class Cat extends Animal{
	public Cat(){
		this.kind = "������";
	}
	@Override
	public void sound() {
		System.out.println("�߿�");
		
	}

}
