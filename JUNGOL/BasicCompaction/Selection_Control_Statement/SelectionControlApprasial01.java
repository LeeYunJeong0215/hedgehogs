package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial01 {

	public static void main(String[] args) {
/* ������ �Է¹޾� ù �ٿ� �Է� ���� ���ڸ� ����ϰ� ��° �ٿ� �����̸� 
 * ��minus�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 
�Է�   [Copy]				�Է�   [Copy]
-5						5
���   [Copy]				���   [Copy]
-5						5
minus
*/ 

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number > 0){
			System.out.println(number);
		}else if(number < 0){
			System.out.println(number);
			System.out.println("minus");
		}else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		scanner.close();

	}

}
