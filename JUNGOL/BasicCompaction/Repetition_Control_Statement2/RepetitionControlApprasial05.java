package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial05 {

	public static void main(String[] args) {
/* 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
   입력   [Copy]
10 15 36 99 100 19 46 88 87 13
   출력   [Copy]
Multiples of 3 : 4
Multiples of 5 : 3*/
 
		Scanner scanner = new Scanner(System.in);
		int count3OfMultiple = 0;
		int count5OfMultiple = 0;
		
		for(int i=0; i<10; i++){
			int selectNums = scanner.nextInt();
						
			if(selectNums % 3 == 0){
				count3OfMultiple++;
			}if(selectNums % 5 == 0){
				count5OfMultiple++;
			}
		}
		System.out.println("Multiples of 3 : " + count3OfMultiple);
		System.out.println("Multiples of 5 : " + count5OfMultiple);
		
		scanner.close();
	}

}
