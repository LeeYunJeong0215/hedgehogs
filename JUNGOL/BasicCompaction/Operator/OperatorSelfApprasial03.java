package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial03 {

	public static void main(String[] args) {
/* 한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 
 * 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
   
  입력   [Copy]
5
  출력   [Copy]
5
7
        
첫번째 줄은 후치증가 연산자를 사용한 결과
둘번째 줄은 전치증가 연산자를 사용한 결과

*/
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		
		System.out.println(num1++);
		System.out.println(++num1);
		
		scanner.close();
		
	}

}
