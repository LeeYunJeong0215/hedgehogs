package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial08 {

	public static void main(String[] args) {
/* 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 
 * 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)
   
입력   [Copy]
10 9 9
출력   [Copy]
1 0*/
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = scanner.nextInt();
		}
		
		if(numbers[0] > numbers[1] && numbers[0] > numbers[2]){
			System.out.print("true");
		}else{
			System.out.print("false");
		}
		
		if(numbers[0]==numbers[1] && numbers[0]==numbers[2]){
			System.out.println(" " + "true");
		}else{
			System.out.println(" " + "false");
		}

		scanner.close();
	}

}
