package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial06 {

	public static void main(String[] args) {
/* 자연수 n을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.

입력   [Copy]
3
출력   [Copy]
ABC
DE
F*/
 
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		char alphabetic = 65; 
			
		for(int i=num; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(alphabetic);
				alphabetic++;
			}
		System.out.println();
			}
		scanner.close();
		}

	}


