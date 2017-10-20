package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial01 {

	public static void main(String[] args) {
/* 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.

입력	[Copy]
A
출력  [Copy]
AAAAAAAAAAAAAAAAAAAA*/
		
		Scanner scanner = new Scanner(System.in);
		
		String inputChar = scanner.nextLine();
		
		for(int i=0; i<20; i++){
			System.out.print(inputChar);
		}
		scanner.close();


	}

}
