package sec02.exam01_nestedclass_object;

public class A {

	// ������
	A() {
		System.out.println("A ��ü�� ������");

		// ���ο��� ��øŬ������ ����ϰ� ���� ���� ��ü�� �����ϸ� ��.
		B b = new B();
		b.field1 = 3;
		b.method1();
	}

	// ��øŬ����(4����)

	// 1.�ν��Ͻ� ��� Ŭ���� : static Ű���� ��� �Ұ�
	class B {
		int field1;

		// static int field2;
		B() {
			System.out.println("B ��ü�� ������");
		}

		void method1() {
		}
		// static void method2(){}
	}

	// 2.���� ��� Ŭ���� : static �ʵ�, �޼ҵ� ��� ��� ����
	static class C {
		int field1;
		static int field2;

		C() {
			System.out.println("C ��ü�� ������");
		}

		void method1() {
		}

		static void method2() {
		}

	}

	// 3.���� Ŭ���� : static �� ����������(public, private) ��� �Ұ�
	// method�� ����� ��� �Ұ��ϹǷ�(=�ܺ� ��� �Ұ�)
	void method(){
		class D{
			int field1;
			//static int field2; ����
			D(){
				System.out.println("D ��ü�� ������");
			}
			void method1(){}
			//static void method2(){}����
		}
		//����Ŭ������ method�� ����� ����� �Ұ��ϹǷ� 
		//�׳� ��ü�� �����ϸ� ��.
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
