package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial08 {

	public static void main(String[] args) {
/* 3���� ������ �Է� �޾� ù ��° ���� ���� ũ�� 1 �ƴϸ� 0�� ����ϰ� 
 * �� ���� ���� ��� ������ 1 �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
   
�Է�   [Copy]
10 9 9
���   [Copy]
1 0*/
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = scanner.nextInt();
		}
		
		if(numbers[0] > numbers[1] && numbers[0] > numbers[2]){
			System.out.print("true");
		}else{
			System.out.print("false");
		}
		
		if(numbers[0]==numbers[1] && numbers[0]==numbers[2]){
			System.out.println(" " + "true");
		}else{
			System.out.println(" " + "false");
		}

		scanner.close();
	}

}
