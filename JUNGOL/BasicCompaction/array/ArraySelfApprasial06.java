package array;

import java.util.Scanner;

public class ArraySelfApprasial06 {

	public static void main(String[] args) {
/* 10���� ������ �Է¹޾� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(�Է¹��� ������ 1000�� ���� �ʴ´�.)

�Է�   [Copy]
5 10 8 55 6 31 12 24 61 2
���   [Copy]
2
      
hint)�ּҰ� ����(��:min)�� �ʱⰪ���δ� �Է� ���� ������ ū ���� �����ؾ� �Ѵ�.*/

		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		int min = 1000;
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = scan.nextInt();
			if(min > numbers[i]){
				min = numbers[i];
			}
		}
		System.out.println(min);
		scan.close();
		


	}

}
