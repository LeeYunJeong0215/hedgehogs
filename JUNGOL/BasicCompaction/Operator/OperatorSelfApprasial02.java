package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial02 {

	public static void main(String[] args) {
		/*���� 2���� �Է¹޾Ƽ� ù ��° ������ 100�� �������� �����ϰ� 
		 *�� ��° ���� 10���� ���� �������� ������ ��  �� ���� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 		 
		�Է�		[Copy]
		20 35
		���     [Copy]
		120 5
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt() + 100;
		int num2 = scanner.nextInt() % 10;
		
		
		System.out.print(num1 + " " + num2);
		
		
		scanner.close();

	}

}
