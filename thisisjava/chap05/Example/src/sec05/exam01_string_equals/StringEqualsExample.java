package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "�Ź�ö";
		String strVal2 = "�Ź�ö";
		
		if(strVal1 == strVal2){
			System.out.println("strVal1�� strVal2�� ������ ����");
		}else{
			System.out.println("strVal1�� strVal2�� ������ �ٸ�");
		}

		String strVal3 = new String("�Ź�ö");//new�����ڸ� ����Ͽ� ���ο� String ��ü ����
		String strVal4 = new String("�Ź�ö");
		
		if(strVal3 == strVal4){
			System.out.println("strVal3�� strVal4�� ������ ����");
		}else{
			System.out.println("strVal3�� strVal4�� ������ �ٸ�");
		}

		if(strVal3.equals(strVal4)){
		//equals()�� �������� ������ ���ϴ°� �ƴ϶� ���ڰ� ������ ���ϴ� �޼ҵ�
			System.out.println("strVal3�� strVal4�� ���ڿ��� ����");
		}
	}

}
