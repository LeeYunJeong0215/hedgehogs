package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial02 {

	public static void main(String[] args) {
/* ��������+100-Ű���� �񸸼�ġ �����̶�� ����.
	Ű�� �����Ը� �ڿ����� �Է¹޾� ù ��° �ٿ� �񸸼�ġ�� ����ϰ�, 
	�񸸼�ġ�� 0���� ũ�� �����ٿ� ��("Obesity")�̶�� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	(��������� �Ʒ� ��� ���� �����ϼ���.)
    
�Է�   [Copy]
155 60
���   [Copy]
5
Obesity*/
 
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		int weight = scanner.nextInt();
		
		int BMI = weight + 100 - height;
		System.out.println(BMI);
		if(BMI > 0){
			System.out.println("Obesity");
		}
		scanner.close();
	}

}
