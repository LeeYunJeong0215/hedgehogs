package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial04 {

	public static void main(String[] args) {
/* 100 ������ ������ �Է¹޾Ƽ� �Է¹��� �������� 100������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�    [Copy]
95
���    [Copy]
585*/
		Scanner scanner = new Scanner(System.in);
		
		int selectNum = scanner.nextInt();
		int sum = 0;
		
		for(int i=100; i>=selectNum; i--){
			sum += i;
		}
		System.out.println(sum);

		scanner.close();
	}

}
