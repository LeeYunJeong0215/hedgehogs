package sec04.multi_catch;

public class CatchByExceptionKindExample {
	//���� catch(�߻��Ǵ� ���ܺ��� ����ó���ڵ带 �ٸ��� �ϰ� ���� ��)
	public static void main(String[] args) {
		try{
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			
			int result = value1 + value2;
			
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �Ű����� ���� �����մϴ�");
			System.out.println("[������]");
			System.out.println("Java TryCatchFinallyRuntimeExceptionExample num1 num2");
			System.out.println("------------------------------------------------------");
		}catch(NumberFormatException e){
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�");
		}finally{
			System.out.println("�ٽ� �����ϼ���");
		}
			
		}

}
