package sec03_try_catch_finally;
//�Ϲݿ���(����ó�� �ڵ尡 ���ٸ� ������ ����)ó��
public class TryCatchFinallyExample {
	public static void main(String[] args){
		try{
			Class clazz1 = Class.forName("java.lang.String2");
			//Class clazz2 = Class.forName("java.lang.String");
			System.out.println("Ŭ������ �����մϴ�");
		}catch(ClassNotFoundException e){
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
