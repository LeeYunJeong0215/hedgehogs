package array;

public class ArraySelfApprasial02 {

	public static void main(String[] args) {
/*���� 10 ���� ������ �� �ִ� �迭�� ���� 1 ���� 10 ������ �����ϰ� 
 * ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
   
���   [Copy]
1 2 3 4 5 6 7 8 9 10
 */
		
		int[] numberArray = new int[10];
		
		for(int i=0; i<numberArray.length; i++){
			numberArray[i] = i+1;
			System.out.print(numberArray[i] + " ");
		}
		
	}

}
