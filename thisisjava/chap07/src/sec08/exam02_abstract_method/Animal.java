package sec08.exam02_abstract_method;

//�߻�Ŭ����(abstract class)
public abstract class Animal {
	public String kind;
	
	public void breathe(){
		System.out.println("���� ���ϴ�.");
	}
	//�߻�޼ҵ�
	public abstract void sound();
}
