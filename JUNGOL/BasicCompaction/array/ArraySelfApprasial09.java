package array;

import java.util.Scanner;

public class ArraySelfApprasial09 {

	public static void main(String[] args) {
		/*
		 * 10���� ������ �Է¹޾� �迭�� ������ �� ������������ �����Ͽ� ����Ͻÿ�.
		 * 
		 * �Է�[Copy] 95 100 88 65 76 89 58 93 77 99
		 * ���[Copy] 100 99 95 93 89 88 77 76 65 58
		 */

		Scanner scan = new Scanner(System.in);

		int[] inputNo = new int[10];
		int temp = 0;

		for (int i = 0; i < inputNo.length; i++) {
			inputNo[i] = scan.nextInt();
		}
		//��������
		for (int i = 0; i < inputNo.length; i++) {
			for (int j = 0; j < inputNo.length - 1; j++) {
				if (inputNo[j] < inputNo[j+1]) {
					temp = inputNo[j];
					inputNo[j] = inputNo[j+1];
					inputNo[j+1] = temp;
				}
			}
		}
		for(int i=0; i<inputNo.length; i++){
			System.out.print(inputNo[i] + " ");	
		}
		scan.close();
		
	}

}
