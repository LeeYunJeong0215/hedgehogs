package sec06.exam06_array_refrence_object;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		//���� ������
		strArray[0] = "java";
		strArray[1] = "java";
		//�ٸ� ������(new ������)
		strArray[2] = new String("java");
		//���� ��������(==)
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		//���� ���ڿ�����(.equls())
		System.out.println(strArray[0].equals(strArray[2]));
	}

}
