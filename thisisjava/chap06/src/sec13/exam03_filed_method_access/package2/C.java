package sec13.exam03_filed_method_access.package2;

import sec13.exam03_filed_method_access.package1.A;

public class C {
	// �ʵ�� �޼ҵ� ȣ���� ���� B class�� �����ڸ� ����� �� �ȿ� new �����ڷ� ��ü ����
	// �ٸ� Ŭ������ �ʵ�� �޼ҵ带 ����Ϸ��� ��ü ������ �ʿ���.
	public C() {
		// �ٸ� ��Ű���� �ٸ� Ŭ���������� public ���������� �ܿ��� ��� �Ұ�.
		A a = new A();
		// �ʵ� �� ����
		a.field1 = 1;
		/*a.field2 = 1;
		a.field3 = 1;*/
		// �޼ҵ� ȣ��
		a.method1();
		/*a.method2();
		a.method3();*/
	}
}
