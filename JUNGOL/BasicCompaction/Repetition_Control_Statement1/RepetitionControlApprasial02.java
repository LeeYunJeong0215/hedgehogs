package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial02 {

	public static void main(String[] args) {
/* 100 ������ ���� ������ �Էµȴ�. 
 * while ���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�    [Copy]
10
���    [Copy]
55*/
		Scanner scanner = new Scanner(System.in);
		
		int inputNum = scanner.nextInt();
		int sum = 0;
		int basicNum = 1;
		
		while(basicNum <= inputNum){
			sum = sum + basicNum;
			++basicNum;
		}
		System.out.println(sum);
		scanner.close();
	}

}
