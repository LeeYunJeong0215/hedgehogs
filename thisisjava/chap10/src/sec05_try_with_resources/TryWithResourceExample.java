package sec05_try_with_resources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			// �����ҷ�����Ű��
			throw new Exception();
			//������ �߻����ڸ��� �ڵ����� close()�޼ҵ� ����.
		} catch (Exception e) {
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
	}

}
