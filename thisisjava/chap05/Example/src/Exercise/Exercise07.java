package Exercise;

public class Exercise07 {

	public static void main(String[] args) {
		//�迭�� �ִ밪 ���ϱ�
		int max = 0;
		int[] array = { 1, 25, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];

			}

		}
		System.out.println("max : " + max);
		System.out.println();
		/*
		 * 1�ð����� ����ߴµ� �� �߸��Ȱ��� Ȯ �ʹ��� �ʴ´�.
		 * ��м��� �ʿ���.
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j >= i; j--) {
				if (array[i] > array[j]) {
					max = array[i];
					
					
				}
			}
			System.out.println("max : " + max);
			System.out.println();
*/	
		}

	}

	
