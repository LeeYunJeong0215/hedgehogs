package Array2;

public class ArraySelfApprasial04 {

	public static void main(String[] args) {
		/*
		 * 3�� 5���� �迭�� �Ʒ� ��� ���� ���� �ʱ�ȭ �� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ���ڻ����� ������ 3ĭ�����ϰ� �� ���ڴ� 2ĭ���� �����ʿ� ���߾� ����Ѵ�. 
		 * ��, "%2d   "
		 * 
		 * ��� [Copy] 
		 * ��� �� => �������� ��µ��� �ʽ��ϴ�.
 			5    8   10    6    4
		    11   20    1   13    2
 			7    9   14   22    3
		 */

		int[][] numbers = { 
				{ 5, 8, 10, 6, 4 }, 
				{ 11, 20, 1, 13, 2 }, 
				{ 7, 9, 14, 22, 3 } };
		
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[0].length; j++){
				System.out.printf("%2d   ",numbers[i][j]);
			}
			System.out.println();
		}
	}

}
