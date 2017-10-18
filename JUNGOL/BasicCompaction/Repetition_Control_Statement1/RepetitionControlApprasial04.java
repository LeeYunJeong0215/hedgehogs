package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial04 {

	public static void main(String[] args) {
/* 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 
 * 합계와 평균을 출력하는 프로그램을 작성하시오. 
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 
입력   [Copy]
1 2 3 4 5 6 7 8 9 10 100
출력     [Copy]
155
14.1
         
힌트 : 입력을 받으면 먼저 누적을 시킨 후에 조건을 확인한다.*/
		Scanner scanner = new Scanner(System.in);
		
		int number = 1;
		int sum = 0; 
		int	accumulation_value = 0;
				
		while(number < 100){
			number = scanner.nextInt();
			sum += number;
			accumulation_value++;
		}
		double avg = (double)sum / accumulation_value;
				
		System.out.println(sum);
		System.out.printf("%.1f", avg);
			 
		scanner.close();	
			
		}

	}


