package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial02 {

	public static void main(String[] args) {
/* �ڿ��� n�� �Է¹޾Ƽ� n�ٸ�ŭ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 
�Է�   [Copy]
5
���   [Copy]
*
**
***
****
******/
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");	
			}
		System.out.println();	
		}
		scanner.close();
	}

}
