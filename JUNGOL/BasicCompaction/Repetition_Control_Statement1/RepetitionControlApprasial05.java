package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial05 {

	public static void main(String[] args) {
/* ������ �Է¹޾Ƽ� 3�� ����� �ƴ� ��쿡�� �ƹ� �۾��� ���� �ʰ� 
 * 3�� ����� ��쿡�� 3���� �������� ����ϴ� �۾��� �ݺ��ϴٰ� 
 * -1�� �ԷµǸ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����¿��� ���� �۾��� ���ప�̴�.
  
�����  [Copy]
5
12
4  ���
21
7  ���
100
-1
         
hint)3�� ����� 3���� ���� �������� 0�̴�.*/
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		while(number != -1){
			number = scanner.nextInt();
			if(number % 3 == 0){
				System.out.println((int)number / 3);
			}
		}
		scanner.close();
	}

}
