package array;

import java.util.Scanner;

public class ArraySelfApprasial04 {

	public static void main(String[] args) {
		/*
		 * 100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0 �� �ԷµǸ� 0 �� �����ϰ� �� ������
		 * �Էµ� ������ ���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� [Copy] 3 5 10 55 0 
		 * ��� [Copy] 55 10 5 3
		 */
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[100];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			if (intArray[i] == 0) {
				break;
			}
		}
		for (int i = intArray.length - 1; i >= 0; i--) {
			if (intArray[i] != 0) {
				System.out.print(intArray[i] + " ");
			}
		}
		scan.close();
	}

}
