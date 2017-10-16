package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial02 {

	public static void main(String[] args) {
		/*정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 
		 *두 번째 수는 10으로 나눈 나머지를 저장한 후  두 수를 차례로 출력하는 프로그램을 작성하시오.
		 		 
		입력		[Copy]
		20 35
		출력     [Copy]
		120 5
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt() + 100;
		int num2 = scanner.nextInt() % 10;
		
		
		System.out.print(num1 + " " + num2);
		
		
		scanner.close();

	}

}
