package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial05 {

	public static void main(String[] args) {
/* �� ���� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� "A", ��� 3.0 �̻��̸� "B", 
 * �ƴϸ� "C" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 
�Է�    [Copy]
4.3 3.5
���    [Copy]
B

�Է�    [Copy]
4.0 2.9
���    [Copy]
C
 */
		Scanner scanner = new Scanner(System.in);
		
		Double num1 = scanner.nextDouble();
		Double num2 = scanner.nextDouble();
		
		if(num1 >= 4.0  && num2 >= 4.0){
			System.out.println("A");
		}else if(num1 >= 3.0 && num2 >= 3.0){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		scanner.close();
	}

}
