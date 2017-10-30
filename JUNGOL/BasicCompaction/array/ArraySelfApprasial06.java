package array;

import java.util.Scanner;

public class ArraySelfApprasial06 {

	public static void main(String[] args) {
/* 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)

입력   [Copy]
5 10 8 55 6 31 12 24 61 2
출력   [Copy]
2
      
hint)최소값 변수(예:min)의 초기값으로는 입력 받을 값보다 큰 값을 지정해야 한다.*/

		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		int min = 1000;
		
		for(int i=0; i<numbers.length; i++){
			numbers[i] = scan.nextInt();
			if(min > numbers[i]){
				min = numbers[i];
			}
		}
		System.out.println(min);
		scan.close();
		


	}

}
