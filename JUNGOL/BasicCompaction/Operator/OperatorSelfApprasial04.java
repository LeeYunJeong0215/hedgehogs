package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial04 {

	public static void main(String[] args) {
		/*�� ���� ������ �Է¹޾� ���� ��ġ ���� �����ڿ� ��ġ ���� �����ڸ� ����Ͽ�
		 *�� ���� ���� ���� �� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
			 
		�Է�   [Copy]
		10 20
		���   [Copy]
		11 19 190
		*/ 
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.print(++num1 + " " + --num2 + " " + --num1*num2);
		
		scanner.close();
	}

}
