package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial04 {

	public static void main(String[] args) {
/* ����ü���� �����԰� 50.80kg ���ϸ� Flyweight 61.23kg ���ϸ� Lightweight, 
 * 72.57kg ���ϸ� Middleweight, 88.45kg ���ϸ� Cruiserweight, 
 * 88.45kg �ʰ��� Heavyweight��� ����.
 �����Ը� �Է¹޾� ü���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   
�Է�   [Copy]
87.3
���   [Copy]
Cruiserweight
*/ 

		Scanner scanner = new Scanner(System.in);
		
		double weight = scanner.nextDouble();
		
		if(weight > 88.45){
			System.out.println("Heavyweight");
		}else if(weight <= 88.45 && weight > 72.57){
			System.out.println("Cruiserweight");
		}else if(weight <= 72.57 && weight > 61.23){
			System.out.println("Middleweight");
		}else if(weight <= 61.23 && weight > 50.80){
			System.out.println("Lightweight");
		}else{
			System.out.println("Flyweight");
		}
		scanner.close();
	}

}
