package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial01 {

	public static void main(String[] args) {
		/*세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. 
		 * (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
				 
		입력[Copy]
		10 25 33
		
		출력[Copy]
		sum : 68
		avg : 22
		*/ 
		
		int[] selectNum = new int[3];
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<selectNum.length; i++){
			selectNum[i] = scanner.nextInt();
			sum += selectNum[i];
		}
		System.out.println("sum : " + sum);
		int avg = sum / selectNum.length;
		System.out.println("avg : " + avg);
		
		scanner.close();
	}

}
