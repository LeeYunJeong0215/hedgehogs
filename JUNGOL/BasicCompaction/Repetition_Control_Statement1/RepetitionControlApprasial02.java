package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial02 {

	public static void main(String[] args) {
/* 100 이하의 양의 정수만 입력된다. 
 * while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.

입력    [Copy]
10
출력    [Copy]
55*/
		Scanner scanner = new Scanner(System.in);
		
		int inputNum = scanner.nextInt();
		int sum = 0;
		int basicNum = 1;
		
		while(basicNum <= inputNum){
			sum = sum + basicNum;
			++basicNum;
		}
		System.out.println(sum);
		scanner.close();
	}

}
