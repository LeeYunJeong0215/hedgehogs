package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial01 {

	public static void main(String[] args) {
/* ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڸ� 20�� �ݺ��Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�	[Copy]
A
���  [Copy]
AAAAAAAAAAAAAAAAAAAA*/
		
		Scanner scanner = new Scanner(System.in);
		
		String inputChar = scanner.nextLine();
		
		for(int i=0; i<20; i++){
			System.out.print(inputChar);
		}
		scanner.close();


	}

}
