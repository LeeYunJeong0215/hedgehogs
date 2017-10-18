package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial05 {

	public static void main(String[] args) {
/* 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
 * 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가 
 * -1이 입력되면 종료하는 프로그램을 작성하시오.
 * 입출력예의 진한 글씨는 실행값이다.
  
입출력  [Copy]
5
12
4  출력
21
7  출력
100
-1
         
hint)3의 배수는 3으로 나눈 나머지가 0이다.*/
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		while(number != -1){
			number = scanner.nextInt();
			if(number % 3 == 0){
				System.out.println((int)number / 3);
			}
		}
		scanner.close();
	}

}
