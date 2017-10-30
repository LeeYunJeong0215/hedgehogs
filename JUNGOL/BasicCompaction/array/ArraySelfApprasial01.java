package array;

import java.util.Scanner;

public class ArraySelfApprasial01 {

	public static void main(String[] args) {
		
		/*문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.

		입력 [Copy]
		A B C D E F G H I J
		출력 [Copy]
		ABCDEFGHIJ*/
	
		Scanner scanner = new Scanner(System.in);
		
		String[] alphabetic = new String[10];
		
		for(int i=0; i<alphabetic.length; i++){
			alphabetic[i]= scanner.next();			
		}
		for(int i=0; i<alphabetic.length; i++){
			System.out.print(alphabetic[i]);
		}
		//System.out.print(alhabetic) <- 이 배열의 주소값 출력
		scanner.close();
	}	

}
