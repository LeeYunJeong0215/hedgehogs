package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial05 {

	public static void main(String[] args) {
/* 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 
 * 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
 
입력    [Copy]
4.3 3.5
출력    [Copy]
B

입력    [Copy]
4.0 2.9
출력    [Copy]
C
 */
		Scanner scanner = new Scanner(System.in);
		
		Double num1 = scanner.nextDouble();
		Double num2 = scanner.nextDouble();
		
		if(num1 >= 4.0  && num2 >= 4.0){
			System.out.println("A");
		}else if(num1 >= 3.0 && num2 >= 3.0){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		scanner.close();
	}

}
