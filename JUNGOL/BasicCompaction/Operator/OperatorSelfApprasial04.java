package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial04 {

	public static void main(String[] args) {
		/*두 개의 정수를 입력받아 각각 후치 증가 연산자와 전치 감소 연산자를 사용하여
		 *두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
			 
		입력   [Copy]
		10 20
		출력   [Copy]
		11 19 190
		*/ 
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.print(++num1 + " " + --num2 + " " + --num1*num2);
		
		scanner.close();
	}

}
