package sec13.exam03_filed_method_access.package1;

public class A {
	//���� ���������ڸ� �ٸ��� �ؼ� �ʵ� ����
	public int field1;
	int field2;
	private int field3;
	
	//���� ���������ڸ��ٸ��� �ؼ� �޼ҵ� ����
	public void method1(){}
	void method2(){}
	private void method3(){}
	
	//������ ����
	public A(){
		//�ʵ� �� ����
		field1 = 1;
		field2 = 1;
		field3 = 1;
		//�޼ҵ� ȣ��
		method1();
		method2();
		method3();
	//���� ��Ű�� ���� Ŭ���������� ������ �ʵ�� �޼ҵ�� ���ٿ� �ƹ� ������ ����.
	}

}
