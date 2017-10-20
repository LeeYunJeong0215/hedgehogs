package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial01 {

	public static void main(String[] args) {
/* 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 
 * 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
   
입력   [Copy]
100
출력   [Copy]
10 100*/
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		int count = 0; 
		int sum = 0;
		
		
		for(int i=1; sum<number; i++){
			if(i%2 != 0){
			sum += i;
			count++;
			//System.out.println(sum + "," + i);
			}
		}
		System.out.print(count + " ");
		System.out.println(sum);
		scanner.close();
	}
		

}
