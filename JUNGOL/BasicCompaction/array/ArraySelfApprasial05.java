package array;

import java.util.Scanner;

public class ArraySelfApprasial05 {

	public static void main(String[] args) {
/* 1�ݺ��� 6�ݱ����� ��������� ������ �� �� ���� �� ��ȣ�� �Է¹޾� 
 * �� �� ��������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
     �ݺ� ��������� �ʱⰪ���� 1�ݺ��� ���ʷ� 85.6 79.5 83.1 80.0 78.2 75.0����
     �ʱ�ȭ�ϰ� ����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� �Ѵ�.
 
�Է�   [Copy]
1 3
���   [Copy]
168.7*/
 
		Scanner scan = new Scanner(System.in);
		
		double[] avgArray = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		
		int classNumber1 = scan.nextInt();
		int classNumber2 = scan.nextInt();
		
		double sum = avgArray[classNumber1-1] + avgArray[classNumber2-1];
		System.out.printf("%.1f",sum);
		
		scan.close();
		
	}

}
