package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		//ParentŸ���� parent ������ child��ü�� �����Ͽ� �ڵ�Ÿ�Ժ�ȯ �߻�
		Parent parent = child;
		
		parent.mehtod1();
		parent.mehtod2(); //�ڽ�Ŭ������ ������(�������̵�)�� method2�� ȣ���
		//parent.method3(); ȣ��Ұ�(ParentŬ�������� method3�� �����Ƿ�)
		

	}

}
