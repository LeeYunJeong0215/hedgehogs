package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial09 {

	public static void main(String[] args) {
/* 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
입력    [Copy]
18 -5 10
출력    [Copy]
-5
      
hint)두 수중 먼저 작은 값을 구한 후 나머지 수와 비교하여 구하면 된다.

예) min = (a < b) ? a : b;
   min = (min < c) ? min : c;
또는 아래 예와 같이 조건 연산자를 중첩하여 한 번에 구하는 방법도 있지만 식이 너무 복잡해지므로 참고는 하되 프로그램 작성할 때에는 가능한 쉬운 방법으로 
작성할 것을 권장한다.
*/
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[3];
		
		
		for(int i=0; i<num.length; i++){
			num[i] = scanner.nextInt();
		}
		int min = num[0];
		
		for(int i=0; i<num.length; i++){
			if(min > num[i]){
				min = num[i];
			}
		}
		
		System.out.println(min);
		scanner.close();
		
	}

}
