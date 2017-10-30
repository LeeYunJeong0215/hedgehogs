package array;

import java.util.Scanner;

public class ArraySelfApprasial03 {

	public static void main(String[] args) {
/* 10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 
 * 차례로 출력하는 프로그램을 작성하시오.

입력   [Copy]
A B C D E F G H I J
출력   [Copy]
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
