package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial04 {

	public static void main(String[] args) {
/* �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   
�Է�   [Copy]
3
���   [Copy]
***
 **
  *
*/
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i=num; i>=1; i--){
			for(int k=0; k>i; k++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.printf("*");
			}
			System.out.println();
			}
			
		
 


	}

}
