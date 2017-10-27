package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprsial07 {

	public static void main(String[] args) {
/* 자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
   
입력   [Copy]
3
출력   [Copy]
1 2 3 A
4 5 B C
6 D E F*/
 
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int number = 1;
		char alphabetic = 65;
		
		for(int i=0; i<num; i++){
			for(int j=0; j<num-i; j++){
				System.out.print(number + " ");
				number++;
			}
			for(int j=0; j<=i; j++){
				System.out.print(alphabetic + " ");
				alphabetic++;
			}
			System.out.println();
		}
		scanner.close();

	}

}
