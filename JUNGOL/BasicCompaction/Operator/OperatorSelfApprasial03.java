package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial03 {

	public static void main(String[] args) {
/* �� ���� ������ �Է� �޾Ƽ� ��ġ���� �����ڸ� ����Ͽ� ����� �� 
 * ��ġ ���� �����ڸ� ����Ͽ� ����ϴ����α׷��� �ۼ��Ͻÿ�.
   
  �Է�   [Copy]
5
  ���   [Copy]
5
7
        
ù��° ���� ��ġ���� �����ڸ� ����� ���
�ѹ�° ���� ��ġ���� �����ڸ� ����� ���

*/
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		
		System.out.println(num1++);
		System.out.println(++num1);
		
		scanner.close();
		
	}

}
