package sec03_try_catch_finally;
//���࿹��(�������ϴ� �������� ���� ó�� �ڵ带 �˻����� �ʴ� ����)ó��
public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try{
			//���ܹ߻������ڵ�
			data1 = args[0];
			data2 = args[1];
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �Ű����� ���� �����մϴ�");
			System.out.println("[������]");
			System.out.println("Java TryCatchFinallyRuntimeExceptionExample num1 num2");
			System.out.println("------------------------------------------------------");
		}
		try{
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
		}catch(NumberFormatException e){
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�");
			System.out.println("------------------------------------------------------");
		}finally{
			System.out.println("�ٽ� �����ϼ���.");
			System.out.println("------------------------------------------------------");
		}
	}	

}
