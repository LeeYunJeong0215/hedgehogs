package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial01 {

	public static void main(String[] args) {
/* �ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���س����鼭 ���� n �̻��̸� 
 * �� ������ ������ Ȧ���� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   
�Է�   [Copy]
100
���   [Copy]
10 100*/
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int count = 0; 
		int sum = 0;
		
		
		for(int i=1; sum<number; i++){
			if(i%2 != 0){
			sum += i;
			count++;
			//System.out.println(sum + "," + i);
			}
		}
		System.out.print(count + " ");
		System.out.println(sum);
		scanner.close();
	}
		

}
