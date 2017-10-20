package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial03 {

	public static void main(String[] args) {
/* 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

입력   [Copy]
3
출력   [Copy]
***
**
*
*
**
***
 */
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=num; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
		System.out.println();
		}
		for(int k=1; k<=num; k++){
			for(int l=1; l<=k; l++){
				System.out.print("*");
			}
		System.out.println();
		}
		
		scanner.close();

	}

}
