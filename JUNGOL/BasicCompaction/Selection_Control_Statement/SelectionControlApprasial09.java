package Selection_Control_Statement;

import java.util.Scanner;

public class SelectionControlApprasial09 {

	public static void main(String[] args) {
/* 3���� ������ �Է¹޾� ���ǿ����ڸ� �̿��Ͽ� �Է¹��� ���� �� �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�    [Copy]
18 -5 10
���    [Copy]
-5
      
hint)�� ���� ���� ���� ���� ���� �� ������ ���� ���Ͽ� ���ϸ� �ȴ�.

��) min = (a < b) ? a : b;
   min = (min < c) ? min : c;
�Ǵ� �Ʒ� ���� ���� ���� �����ڸ� ��ø�Ͽ� �� ���� ���ϴ� ����� ������ ���� �ʹ� ���������Ƿ� ����� �ϵ� ���α׷� �ۼ��� ������ ������ ���� ������� 
�ۼ��� ���� �����Ѵ�.
*/
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[3];
		
		
		for(int i=0; i<num.length; i++){
			num[i] = scanner.nextInt();
		}
		int min = num[0];
		
		for(int i=0; i<num.length; i++){
			if(min > num[i]){
				min = num[i];
			}
		}
		
		System.out.println(min);
		scanner.close();
		
	}

}
