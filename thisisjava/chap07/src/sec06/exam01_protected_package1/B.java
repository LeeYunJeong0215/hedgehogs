package sec06.exam01_protected_package1;

public class B {
	public void method(){
		A a = new A();
		//protected �����ڴ� ���� ��Ű�������� default�� ȿ���� ����
		//�ʵ�, ������, �޼ҵ忡 �󸶵��� ���� ����.
		a.field = "value";
		a.method();
		
	}
}
