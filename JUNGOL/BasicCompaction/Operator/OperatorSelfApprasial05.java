package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial05 {

	public static void main(String[] args) {
/*�� ���� ������ �Է¹޾Ƽ�
  ù ��° �ٿ��� �� ������ ���� ������ 1 �ƴϸ� 0�� ����ϰ�
  �� ��° �ٿ��� ���� ������ 1 ������ 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
 
�Է�   [Copy]
5 5
���   [Copy]
1
0
*/ 

		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		boolean run1, run2 = false;
		
		if(num1 == num2){
			run1 = true;
			run2 = false;
			System.out.println(run1);
			System.out.println(run2);
			
		}else if(num1 != num2){
			run1 = false;
			run2 = true;
			System.out.println(run1);
			System.out.println(run2);
		}		
		
		scanner.close();
	}

}
