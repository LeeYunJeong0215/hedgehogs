package array;

import java.util.Scanner;

public class ArraySelfApprasial08 {
	public static void main(String[] args){
		/*10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ�
		 *Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.

	 	�Է�	[Copy]
		95 100 88 65 76 89 58 93 77 99
		���  [Copy]
		sum : 446
		avg : 78.8*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNo = new int[10];
		
		int sum1 = 0;
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<inputNo.length; i++){
			inputNo[i] = scan.nextInt();
			if(!(i%2 == 0)){
				sum1 += inputNo[i];
			}
			else{
				sum += inputNo[i];
				avg = sum / (inputNo.length / 2.0);
			}
		}
		System.out.println("sum : " + sum1);
		System.out.printf("avg : %.1f", avg);
		scan.close();
	}
	
}
