package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial07 {

	public static void main(String[] args) {
/*���� �빮�ڸ� �Է¹޾� 
'A'�̸� ��Excellent��, 
'B'�̸� ��Good��, 
'C'�̸� ��Usually��, 
'D'�̸� ��Effort��, 
'F'�̸� ��Failure��, 
�� �� �����̸� ��error�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�   [Copy]
B
���   [Copy]
Good*/
		
		Scanner scanner = new Scanner(System.in);
		
		String upper = scanner.nextLine();
		
		switch(upper){
			case "A" :
				System.out.println("Excellent");
				break;
			case "B" :
				System.out.println("Good");
				break;
			case "C" :
				System.out.println("Usually");
				break;
			case "D" :
				System.out.println("Effort");
				break;
			case "F" :
				System.out.println("Failure");
				break;
			default :
				System.out.println("error");
				break;
			
		}
		scanner.close();

	}

}
