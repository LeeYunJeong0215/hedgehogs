package Operator;

import java.util.Scanner;

public class OperatorSelfApprasial01 {

	public static void main(String[] args) {
		/*�� ���� ������ �Է� �޾Ƽ� �հ�� ����� ����Ͻÿ�. 
		 * (�� ����� �Ҽ� ���ϸ� ������ �����κи� ����Ѵ�.)
				 
		�Է�[Copy]
		10 25 33
		
		���[Copy]
		sum : 68
		avg : 22
		*/ 
		
		int[] selectNum = new int[3];
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<selectNum.length; i++){
			selectNum[i] = scanner.nextInt();
			sum += selectNum[i];
		}
		System.out.println("sum : " + sum);
		int avg = sum / selectNum.length;
		System.out.println("avg : " + avg);
		
		scanner.close();
	}

}
