package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		//�ڵ�Ÿ�Ժ�ȯ
		Parent parent = new Child();
		
		//parent.field1 //�����߻� ��? �ʵ��ε� ���ͷ��� ��� �׷���.
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*�Ұ���(ParentŸ���̹Ƿ� �ڽİ�ü�� �ʵ�� �޼ҵ� ���Ұ�)
		parent.field2();
		parent.method3();
		*/
		
		//����Ÿ�Ժ�ȯ
		//�θ�Ÿ���� �ڽ�Ÿ������ ��ȯ�Ͽ� �ڽ�Ŭ������ �ʵ�� �޼ҵ� ��밡��.
		Child child1 = (Child) new Parent();
		Child child2 = (Child) parent;
		
		
		child1.field2 = "yyy";
		child1.method3();
		child2.field2 = "yyy";
		child2.method3();
		
		//�̷��� �ϸ� �� ����� �����ϱ�..
		child1.field1 = " ";
		child1.method1();
		child1.method2();
	}

}
