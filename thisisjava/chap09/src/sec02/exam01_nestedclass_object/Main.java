package sec02.exam01_nestedclass_object;

public class Main {
	public static void main(String[] args){
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ���� ���
		A.B b = a.new B();
		//A.B b = new A.B();�̷��� �ٷ� ������ ȣ���� �Ұ�
		b.field1 = 3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ���� ����� �ν��Ͻ� ��� ��ü ���� ����� �ٸ�
		A.C c = new A.C();
		//A.C c = a.new C(); ���� �߻�
		c.field1 = 5;
		c.method1();
		//���� �ʵ�� �ν��Ͻ� �ʵ� ���� A��ü ������ �ʿ� ����
		A.C.field2 = 5;
		A.C.method2();
		
		a.method();
		
	}

}
