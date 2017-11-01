package array;

import java.util.Scanner;

public class ArraySelfApprasial09 {

	public static void main(String[] args) {
		/*
		 * 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
		 * 
		 * 입력[Copy] 95 100 88 65 76 89 58 93 77 99
		 * 출력[Copy] 100 99 95 93 89 88 77 76 65 58
		 */

		Scanner scan = new Scanner(System.in);

		int[] inputNo = new int[10];
		int temp = 0;

		for (int i = 0; i < inputNo.length; i++) {
			inputNo[i] = scan.nextInt();
		}
		//버블정렬
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
