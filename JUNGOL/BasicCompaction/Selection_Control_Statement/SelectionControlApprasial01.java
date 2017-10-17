package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial01 {

	public static void main(String[] args) {
/* 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 
 * “minus” 라고 출력하는 프로그램을 작성하시오.
 
입력   [Copy]				입력   [Copy]
-5						5
출력   [Copy]				출력   [Copy]
-5						5
minus
*/ 

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number > 0){
			System.out.println(number);
		}else if(number < 0){
			System.out.println(number);
			System.out.println("minus");
		}else{
			System.out.println("잘못 입력하셨습니다");
		}
		scanner.close();

	}

}
