package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial03 {

	public static void main(String[] args) {
/*���̸� �Է¹޾� 20�� �̻��̸� "adult"��� ����ϰ� �׷��� ������ �� ���Ŀ� ������ �Ǵ����� 
 * "�� years later"��� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 
�Է�   [Copy]
18
���   [Copy]
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
