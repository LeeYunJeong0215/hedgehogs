package Repetition_Control_Statement2;

public class RepetitionControlApprasial07 {

	public static void main(String[] args) {
		/*
		 * �Ʒ��� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * ��� [Copy] 
		 * 2 3 4 5 6 
		 * 3 4 5 6 7 
		 * 4 5 6 7 8 
		 * 5 6 7 8 9
		 * 6 7 8 9 10
		 * 
		 * i�� j���� �� �� Ȱ���Ͽ� ���� ����� ����.
		 */
		
		for (int i = 0; i < 5; i++) {
			int basicNum = 2 + i;
			for (int j = 1; j <= 5; j++) {
				System.out.print(basicNum + " ");
				basicNum++;
				if (j % 5 == 0) {
					System.out.println();
				}

			}

		}
	}
}


