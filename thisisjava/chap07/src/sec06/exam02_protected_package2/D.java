package sec06.exam02_protected_package2;

import sec06.exam01_protected_package1.A;

public class D extends A{
	//protected �����ڴ� ����� ���� �ʵ�, ������, �޼ҵ忡 ������ �����ϴ�
	//�׷��� new �����ڸ� ����� ���� ����, super()�� �����ڸ� ȣ���ؼ� ��ӹ޾� ����� �����ϴ�.
	public D(){
		super();
		this.field = "value";
		this.method();
	}
}
