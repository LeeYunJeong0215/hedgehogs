package sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
	
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1); //��ȣ����
		System.out.println(result2);//��ȣ�ٲ�
		
		short s = 100;
		//short result3 = -s;  �����Ͽ���, ��ȣ�����ڿ� ���� ���� int�ε� short�� �����Ϸ��� �߱� ������
		int result3 = -s;
		System.out.println(result3);
	}

}
