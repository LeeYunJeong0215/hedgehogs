package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial04 {

	public static void main(String[] args) {
/* ������ ��� �Է¹޴ٰ� 100 �̻��� ���� �Է��� �Ǹ� ������ �Էµ� ���� �����Ͽ� 
 * �հ�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
(����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.)
 
�Է�   [Copy]
1 2 3 4 5 6 7 8 9 10 100
���     [Copy]
155
14.1
         
��Ʈ : �Է��� ������ ���� ������ ��Ų �Ŀ� ������ Ȯ���Ѵ�.*/
		Scanner scanner = new Scanner(System.in);
		
		int number = 1;
		int sum = 0; 
		int	accumulation_value = 0;
				
		while(number < 100){
			number = scanner.nextInt();
			sum += number;
			accumulation_value++;
		}
		double avg = (double)sum / accumulation_value;
				
		System.out.println(sum);
		System.out.printf("%.1f", avg);
			 
		scanner.close();	
			
		}

	}


