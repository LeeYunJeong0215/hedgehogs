package Array2;

import java.util.Scanner;

public class ArraySelfApprasial03 {
	public static void main(String[] args) {
		/*
		 * 100 ������ �ڿ����� �Է¹޾� ù ��° ���� 100���� 
		 * �� ��° ���� �Է¹��� ���� �ʱ�ȭ�ϰ� ���� �׺��ʹ� �����׿���
		 * ������ �� ���� ä�������� ������ �ۼ��Ͽ� �� ���� ������ ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� [Copy] 62 ��� [Copy]y 100 62 38 24 14 10 4 6 -2
		 */

		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		//�迭�� ��ȿ�������� ���� ���� �� �ۿ� ���µ� �̰� ���� �� �ִ� ����� �����ϱ�?
		int[] input = new int[inputNum];
		
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
