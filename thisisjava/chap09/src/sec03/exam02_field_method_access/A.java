package sec03.exam02_field_method_access;

//��� Ŭ���������� ��� ����
public class A {
	int field1;
	void method1(){}
	
	static int field2;
	static void method2(){}
	
	//�ν��Ͻ� �ɹ� Ŭ����(��� ���� ����)
	class B{
		void method(){
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//���� ��� Ŭ����(�ν��Ͻ� �ʵ�� �޼ҵ�� ���� �Ұ�)
	static class C{
		void method(){
			//�ν��Ͻ� �ʵ�� �޼ҵ�� ��� �Ұ�.
			/*field1 = 10;
			method1();*/
						
			field2 = 10;
			method2();
		}
	}

}
