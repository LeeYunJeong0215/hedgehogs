package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial06 {

	public static void main(String[] args) {
/*�� ���� ������ �Է¹޾Ƽ� ������ ���� 4���� ���迬������ ����� ����Ͻÿ�.
�̶� �Է¹��� �� ������ �̿��Ͽ� ����Ͻÿ�.
(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)

�Է�   [Copy]
4 5
���     [Copy]
4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1
*/
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
				
		System.out.print(num1 + " > " + num2 + " --- ");
		System.out.println(num1>num2);
		System.out.print(num1 + " < " + num2 + " --- ");
		System.out.println(num1<num2);
		System.out.print(num1 + " >= " + num2 + " --- ");
		System.out.println(num1>=num2);
		System.out.print(num1 + " <= " + num2 + " --- ");
		System.out.println(num1<=num2);
		
		scanner.close();

	}

}
