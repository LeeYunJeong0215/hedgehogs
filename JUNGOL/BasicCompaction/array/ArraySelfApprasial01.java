package array;

import java.util.Scanner;

public class ArraySelfApprasial01 {

	public static void main(String[] args) {
		
		/*���� 10���� ������ �� �ִ� �迭�� ����� 10���� ���ڸ� �Է¹޾� �Է¹��� ���ڸ� �̾ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		�Է� [Copy]
		A B C D E F G H I J
		��� [Copy]
		ABCDEFGHIJ*/
	
		Scanner scanner = new Scanner(System.in);
		
		String[] alphabetic = new String[10];
		
		for(int i=0; i<alphabetic.length; i++){
			alphabetic[i]= scanner.next();			
		}
		for(int i=0; i<alphabetic.length; i++){
			System.out.print(alphabetic[i]);
		}
		//System.out.print(alhabetic) <- �� �迭�� �ּҰ� ���
		scanner.close();
	}	

}
