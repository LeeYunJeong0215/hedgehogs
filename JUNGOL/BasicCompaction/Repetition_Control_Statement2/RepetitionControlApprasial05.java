package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial05 {

	public static void main(String[] args) {
/* 10���� ������ �Է¹޾� 3�� ����� ������ 5�� ����� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   �Է�   [Copy]
10 15 36 99 100 19 46 88 87 13
   ���   [Copy]
Multiples of 3 : 4
Multiples of 5 : 3*/
 
		Scanner scanner = new Scanner(System.in);
		int count3OfMultiple = 0;
		int count5OfMultiple = 0;
		
		for(int i=0; i<10; i++){
			int selectNums = scanner.nextInt();
						
			if(selectNums % 3 == 0){
				count3OfMultiple++;
			}if(selectNums % 5 == 0){
				count5OfMultiple++;
			}
		}
		System.out.println("Multiples of 3 : " + count3OfMultiple);
		System.out.println("Multiples of 5 : " + count5OfMultiple);
		
		scanner.close();
	}

}
