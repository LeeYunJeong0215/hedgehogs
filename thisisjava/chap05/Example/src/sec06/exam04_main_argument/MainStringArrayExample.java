package sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		//main()�޼ҵ忡 �Ű������� �༭ �� ���ϱ�
		if(args.length != 2){
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayExample num1 num2");
			System.exit(0);//���α׷� ��������
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
