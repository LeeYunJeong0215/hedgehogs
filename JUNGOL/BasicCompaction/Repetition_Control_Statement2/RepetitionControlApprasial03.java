package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial03 {

	public static void main(String[] args) {
		/*
		 * �ϳ��� ������ �Է¹޾� 1���� �Է¹��� ���������� ¦���� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �ԷµǴ� ������
		 * 50�����̴�.
		 * 
		 * �Է� [Copy] 10 ��� [Copy] 2 4 6 8 10
		 */

		Scanner scanner = new Scanner(System.in);

		int selectNum = scanner.nextInt();

		for (int i = 1; i <= selectNum; i++) {
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
			
		}
		scanner.close();

	}
}
