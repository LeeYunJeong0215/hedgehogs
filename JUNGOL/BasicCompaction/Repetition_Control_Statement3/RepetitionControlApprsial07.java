package Repetition_Control_Statement3;

import java.util.Scanner;

public class RepetitionControlApprsial07 {

	public static void main(String[] args) {
/* �ڿ��� n�� �Է¹޾Ƽ� n���� �ٿ� n+1���� ���� Ȥ�� ���ڷ� ä���� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   
�Է�   [Copy]
3
���   [Copy]
1 2 3 A
4 5 B C
6 D E F*/
 
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int number = 1;
		char alphabetic = 65;
		
		for(int i=0; i<num; i++){
			for(int j=0; j<num-i; j++){
				System.out.print(number + " ");
				number++;
			}
			for(int j=0; j<=i; j++){
				System.out.print(alphabetic + " ");
				alphabetic++;
			}
			System.out.println();
		}
		scanner.close();

	}

}
