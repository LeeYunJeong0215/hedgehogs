package sec03.exam03_localclass_access;
//���� Ŭ���� ������ ��� ����
public class Outter {
	// �ڹ� 7 ����
	public void method1(final int arg) {// �޼ҵ��� �Ű�������
		final int localVariable = 1;// �޼ҵ��� ���ú�����
		// final Ư���� �����Ƿ� �ʱ� �� ���� �Ұ�.
		// arg = 100;
		// localVariable = 4;
		class inner {
			public void method() {
				// ���� Ŭ����(�޼ҵ� ���� Ŭ����)���� ����Ϸ��� �Ҷ�
				// final ����� method���� ���� ������ 
				// �޼ҵ��� �Ű������� ���ú����� ����(p.399)����
				int result = arg + localVariable;
				// �޼ҵ��� �Ű������� �޼ҵ��� ���ú����� final�� �ٿ����� ������ ���� �߻�
			}
		}
	}

	// �ڹ� 8 ����
	public void method2(int arg) {// �޼ҵ��� �Ű�����
		int localVariable = 1;// �޼ҵ��� ���ú���
		// final Ư���� �����Ƿ� ���� Ŭ���� ������ ���� ���̸� �ʱ� �� ���� �Ұ�.
		// arg = 100;
		localVariable = 4; // ���� Ŭ���� ������ ������ ������ ������ �� ���� ����.
		class inner {
			//�޼ҵ��� �Ű������� ���ú����� final�� ������ ������
			//�������� Ŭ���� ���� �ʵ�� ������ ���
			public void method() {
				// ���� Ŭ����(�޼ҵ� ���� Ŭ����)���� ����Ϸ��� �Ҷ�
				int result = arg;
				// �޼ҵ��� �Ű������� �޼ҵ��� ���ú����� final�� �ٿ����� �ʾƵ� ��
				// final�� ������ �ʾƵ� �޼ҵ��� �Ű������� ���ú����� final�� Ư���� ���´�.
				// ���� final�� ��������� ���൵ �ȴ�.
				// 
			}
		}
	}
}