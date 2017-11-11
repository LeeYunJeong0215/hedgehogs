package Array2;

import java.util.Scanner;

public class ArraySelfApprasial03 {
	public static void main(String[] args) {
		/*
		 * 100 이하의 자연수를 입력받아 첫 번째 항은 100으로 
		 * 두 번째 항은 입력받은 수로 초기화하고 다음 항부터는 전전항에서
		 * 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 [Copy] 62 출력 [Copy]y 100 62 38 24 14 10 4 6 -2
		 */

		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		//배열을 비효율적으로 많이 만들 수 밖에 없는데 이걸 줄일 수 있는 방법은 무엇일까?
		//int[] input = new int[inputNum];
		
		//최대 9개 이상의 배열은 필요가 없음.(62 입력시 출력 9개로 최대)
		int[] input = new int[9]; 
		
		input[0] = 100;
		input[1] = inputNum;
		
		for(int i=2; i<input.length; i++){
			input[i] = input[i-2] - input[i-1];
			 
		}
		for(int i=0; i<input.length; i++){
			System.out.print(input[i] + " ");
			if(input[i] < 0){
				break;
			}
			
		}
		scan.close();
	}

}
