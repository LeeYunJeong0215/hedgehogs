package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprasial06 {

	public static void main(String[] args) {
/* �ڿ��� n�� �Է¹޾� ������ ���� �����ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�   [Copy]
3
���   [Copy]
ABC
DE
F*/
 
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		char alphabetic = 65; 
			
		for(int i=num; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(alphabetic);
				alphabetic++;
			}
		System.out.println();
			}
		scanner.close();
		}

	}


