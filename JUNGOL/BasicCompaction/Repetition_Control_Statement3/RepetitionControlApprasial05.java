package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial05 {

	public static void main(String[] args) {
/* �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 
�Է�   [Copy]
3
���   [Copy]
*****
 ***
  *
  
  */
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i=num-1; i>=0; i--){
			for(int j=0; j<=num-i-2; j++){
				System.out.print(" ");
			}
			for(int j=0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		scanner.close();

	}

}
