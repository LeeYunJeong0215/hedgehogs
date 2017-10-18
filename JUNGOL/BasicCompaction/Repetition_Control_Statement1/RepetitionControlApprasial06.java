package Repetition_Control_Statement1;

import java.util.Scanner;

public class RepetitionControlApprasial06 {

	public static void main(String[] args) {
		/*아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 
		 *해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.

		* 각 나라의 수도 : 
		대한민국 = 서울(Seoul)
		미국 = 워싱턴(Washington)
		일본 = 동경(Tokyo)
		중국 = 북경(Beijing)
		* 입출력시 모양은 "입·출력예"와 같이 하시오.​   
		 
		입출력  [Copy]
		1. Korea
		2. USA
		3. Japan
		4. China
		number? 1

		Seoul

		1. Korea
		2. USA
		3. Japan
		4. China
		number? 5

		none
*/		 

		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while(run){
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			int selectNum = scanner.nextInt();
			System.out.println();
								
			switch(selectNum){
				case 1:
					System.out.println("Seoul");
					System.out.println();
					break;
				case 2:
					System.out.println("Washington");
					System.out.println();
					break;
				case 3:
					System.out.println("Tokyo");
					System.out.println();
					break;
				case 4:
					System.out.println("Beijing");
					System.out.println();
					break;
				default :
					System.out.println("none");
					run = false;
					break;
			}
			
		}
		scanner.close();
		 


	}

}
