package Array2;

import java.util.Scanner;

public class ArraySelfApprasial05 {

	public static void main(String[] args) {
		/*2행 4열의 배열 두 개를 만들어 입력을 받고 
		 *두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.

		입력[Copy]
		first array
		1 2 3 4
		5 6 7 8
		second array
		1 4 7 8
		3 6 9 8
		
		출력[Copy]
		1 8 21 32
		15 36 63 64*/
		
		Scanner scan = new Scanner(System.in);
		
		int[][] firstArr = new int[2][4];
		int[][] secondtArr = new int[2][4];
		int[][] result = new int[2][4];
		
		System.out.println("first array");
		for(int i=0; i<firstArr.length; i++){
			for(int j=0; j<firstArr[0].length; j++){
				firstArr[i][j] = scan.nextInt();
			}
			
		}
		System.out.println("second array");
		for(int i=0; i<secondtArr.length; i++){
			for(int j=0; j<secondtArr[0].length; j++){
				secondtArr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[0].length; j++){
				result[i][j] = firstArr[i][j] * secondtArr[i][j];
				System.out.printf("%d ", result[i][j]);
			}
			System.out.println();
		}
		
		scan.close();
		
		

	}

}
