package sec03.exam01_member_class_access;

//�ٱ� �ʵ�� �޼ҵ忡�� ��� ����
public class A {
	class B{} //�ν��Ͻ� ��� Ŭ����
	static class C{} //���� ��� Ŭ����

	//�ν��Ͻ� �ʵ�(���� ����)
	B field1 = new B();
	C field2 = new C();
	
	//�ν��Ͻ� �޼ҵ�(���Ѿ���)
	void method1(){
		B var1 = new B();
		C var2 = new C();
	}
	//���� �ʵ�(���� ��� Ŭ������ ��ü ���� ����)
	//static B field3 = new B(); ����
	static C field4 = new C();
	
	//���� �޼ҵ�(���� ���� ��� Ŭ������ �޼ҵ� �� ��ü ���� ����)
	static void method2(){
		//B var3 = new B();
		C var4 = new C();
	}
}
