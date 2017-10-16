package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial06 {

	public static void main(String[] args) {
/*두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
이때 입력받은 두 정수를 이용하여 출력하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)

입력   [Copy]
4 5
출력     [Copy]
4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1
*/
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
				
		System.out.print(num1 + " > " + num2 + " --- ");
		System.out.println(num1>num2);
		System.out.print(num1 + " < " + num2 + " --- ");
		System.out.println(num1<num2);
		System.out.print(num1 + " >= " + num2 + " --- ");
		System.out.println(num1>=num2);
		System.out.print(num1 + " <= " + num2 + " --- ");
		System.out.println(num1<=num2);
		
		scanner.close();

	}

}
