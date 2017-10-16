package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial05 {

	public static void main(String[] args) {
/*두 개의 정수를 입력받아서
  첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고
  두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.

(JAVA는 1이면 true, 0이면 false를 출력한다.)
 
입력   [Copy]
5 5
출력   [Copy]
1
0
*/ 

		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		boolean run1, run2 = false;
		
		if(num1 == num2){
			run1 = true;
			run2 = false;
			System.out.println(run1);
			System.out.println(run2);
			
		}else if(num1 != num2){
			run1 = false;
			run2 = true;
			System.out.println(run1);
			System.out.println(run2);
		}		
		
		scanner.close();
	}

}
