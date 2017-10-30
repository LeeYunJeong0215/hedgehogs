package array;

import java.util.Scanner;

public class ArraySelfApprasial04 {

	public static void main(String[] args) {
		/*
		 * 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지
		 * 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 [Copy] 3 5 10 55 0 
		 * 출력 [Copy] 55 10 5 3
		 */
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[100];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if (intArray[i] == 0) {
				break;
			}
		}
		for (int i = intArray.length - 1; i >= 0; i--) {
			if (intArray[i] != 0) {
				System.out.print(intArray[i] + " ");
			}
		}
		scan.close();
	}

}
