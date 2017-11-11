package sec05.exam01_anonymous_extends;
//anonymous child class
public class Anonymous {
	//1. �ʵ� �ʱⰪ���� ����
	Person field = new Person(){
		void work(){
			System.out.println("����մϴ�");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		}
	};
	
	//2.���� ���� ������ ����
	void method1(){
		Person localVar = new Person(){
			void walk(){
				System.out.println("��å�մϴ�");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�");
				walk();
			}
		};
		localVar.wake();
	}
	//3.�޼ҵ� ȣ�� �� �Ű������� �ڽ� �͸� ��ü�� ����ϱ� ���� �޼ҵ�����
	void method2(Person person){
		person.wake();
	}
	
	
}
