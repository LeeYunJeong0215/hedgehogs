package array;

import java.util.Scanner;

public class ArraySelfApprasial07 {

	public static void main(String[] args) {
/* 10���� ������ �Է¹޾� 100 �̸��� �� �� ���� ū ���� 
 * 100 �̻��� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
(�ԷµǴ� ������ ������ 1�̻� 10,000 �̸��̴�. 
���� �ش��ϴ� ���� ���� ������ 100 �� ����Ѵ�.)
 
�Է�   [Copy]
88 123 659 15 443 1 99 313 105 48
���   [Copy]
99 105
 
hint)100 �̸��� ���� �Է� ������ ������ 1~99, 
100 �̻��� ���� �Է� ������ ������ 100~9999 �̴�. 
�Է°����� ū��(������)�� �ʱⰪ���� ���ϰ� �۾��� ���� �� 
�ʱⰪ�� �״�� �ִٸ� �ش��ϴ� ���� ���� ���̴�.
*/

		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		int max = 0;
		int min = 9999;
		
		for(int i=0; i<inputNum.length; i++){
			inputNum[i] = scan.nextInt();
			if(max < inputNum[i]){
				max = inputNum[i];
				if(max<100 || max>0){
					max = 100;
				}
			}
			
		}
		System.out.print(max + " ");


	}

}
