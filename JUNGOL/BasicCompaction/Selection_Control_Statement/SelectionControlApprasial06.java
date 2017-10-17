package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial06 {

	public static void main(String[] args) {
/* 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
    성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), 
   "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.

입력   [Copy]
F 15
출력   [Copy]
GIRL
 */

		Scanner scanner = new Scanner(System.in);
		
		//String입력시 .nextLine()은 한 줄 입력 받는 것이므로 띄워서 바로 입력 받으려면 .next사용
		
		//Scanner도 같은 자료형끼리 넣는게 좋다는 블로그를 보고 
		//따로따로 넣어줘봤는데 안나옴..왜그런지는 모르겠다.
		/*Scanner scanner1= new Scanner(System.in);
		Scanner scanner2= new Scanner(System.in);
		String gender = scanner1.next();
		int age = scanner2.nextInt();*/
		
		String gender = scanner.next();
		int age = scanner.nextInt();
		
		//문자열 비교는 .equals()!!!!!!!
		if(gender.equals("F") && age >= 18){
			System.out.println("WOMAN");
		}else if(gender.equals("F") && age < 18){
			System.out.println("GIRL");
		}else if(gender.equals("M") && age >= 18){
			System.out.println("MAN");
		}else if(gender.equals("M") && age < 18){
			System.out.println("BOY");
		}
		scanner.close();
		
	}

}
