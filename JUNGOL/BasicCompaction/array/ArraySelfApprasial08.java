package array;

import java.util.Scanner;

public class ArraySelfApprasial08 {
	public static void main(String[] args){
		/*10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과
		 *홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오. 
		평균은 반올림하여 소수첫째자리까지 출력한다.

	 	입력	[Copy]
		95 100 88 65 76 89 58 93 77 99
		출력  [Copy]
		sum : 446
		avg : 78.8*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNo = new int[10];
		
		int sum1 = 0;
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<inputNo.length; i++){
			inputNo[i] = scan.nextInt();
			if(!(i%2 == 0)){
				sum1 += inputNo[i];
			}
			else{
				sum += inputNo[i];
				avg = sum / (inputNo.length / 2.0);
			}
		}
		System.out.println("sum : " + sum1);
		System.out.printf("avg : %.1f", avg);
		scan.close();
	}
	
}
