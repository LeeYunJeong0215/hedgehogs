package sec05.exam01_anonymous_extends;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// �͸��ڽİ�ü�� �������� �޼ҵ� ȣ��
		anony.field.wake();
		// �͸��ڽİ�ü�� ���ú����� ����� �޼ҵ� ȣ��
		anony.method1();
		// �͸� ��ü�� �޼ҵ� ȣ�� ������ ���
		anony.method2(new Person() {
			void study() {
				System.out.println("���θ� �մϴ�");
			}

			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�");
				study();
			}

		});
	}
}
