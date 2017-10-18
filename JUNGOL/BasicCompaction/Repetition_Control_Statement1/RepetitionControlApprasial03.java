package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial03 {

	public static void main(String[] args) {
/* 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 
 * 출력 하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
 * 입출력예의 진한글씨는 출력값입니다.​   
		 
		입출력    [Copy]
		number? 10
		positive integer  출
		number? -10
		negative number   출
		number? 0
		  
*/		 


		Scanner scanner = new Scanner(System.in);
		int number = 1;

		while (number != 0) {
			System.out.print("number? ");
			number = scanner.nextInt();
			if (number > 0) {
				System.out.println("positive integer");
			} else if (number < 0) {
				System.out.println("negative number");
			}
		}
		scanner.close();

	}
}
