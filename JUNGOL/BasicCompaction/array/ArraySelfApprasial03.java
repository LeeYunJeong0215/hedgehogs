package array;

import java.util.Scanner;

public class ArraySelfApprasial03 {

	public static void main(String[] args) {
/* 10���� ���ڸ� �Է¹޾Ƽ� ù ��° �� ��° �ϰ� ��° �Է¹��� ���ڸ� 
 * ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�   [Copy]
A B C D E F G H I J
���   [Copy]
A D G
*/ 
		Scanner scan = new Scanner(System.in);
		
		String[] charArray = new String[10];
		
		for(int i=0; i<charArray.length; i++){
			charArray[i] = scan.next();
		}
		System.out.print(charArray[0] + " ");
		System.out.print(charArray[3] + " ");
		System.out.print(charArray[6]);
		
		scan.close();
	}
		

}
