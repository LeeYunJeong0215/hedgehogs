package Array2;

import java.util.Scanner;

public class ArraySelfApprasial05 {

	public static void main(String[] args) {
		/*2�� 4���� �迭 �� ���� ����� �Է��� �ް� 
		 *�� �迭�� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		�Է�[Copy]
		first array
		1 2 3 4
		5 6 7 8
		second array
		1 4 7 8
		3 6 9 8
		
		���[Copy]
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
