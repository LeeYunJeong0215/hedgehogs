package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial03 {

	public static void main(String[] args) {
/*나이를 입력받아 20살 이상이면 "adult"라고 출력하고 그렇지 않으면 몇 년후에 성인이 되는지를 
 * "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
		 
입력   [Copy]
18
출력   [Copy]
2 years later
		 
*/
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		if(age >= 20){
			System.out.println("adult");
		}else{
			System.out.println(20-age + " years later");
		}

		scanner.close();
	}

}
