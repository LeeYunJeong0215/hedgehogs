package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial04 {

	public static void main(String[] args) {
/* 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
입력    [Copy]
95
출력    [Copy]
585*/
		Scanner scanner = new Scanner(System.in);
		
		int selectNum = scanner.nextInt();
		int sum = 0;
		
		for(int i=100; i>=selectNum; i--){
			sum += i;
		}
		System.out.println(sum);

		scanner.close();
	}

}
