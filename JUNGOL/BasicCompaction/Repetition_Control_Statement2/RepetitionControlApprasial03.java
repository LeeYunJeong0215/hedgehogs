package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial03 {

	public static void main(String[] args) {
		/*
		 * 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오. 입력되는 정수는
		 * 50이하이다.
		 * 
		 * 입력 [Copy] 10 출력 [Copy] 2 4 6 8 10
		 */

		Scanner scanner = new Scanner(System.in);

		int selectNum = scanner.nextInt();

		for (int i = 1; i <= selectNum; i++) {
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
			
		}
		scanner.close();

	}
}
