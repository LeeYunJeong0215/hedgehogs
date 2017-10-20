package Repetition_Control_Statement2;

public class RepetitionControlApprasial07 {

	public static void main(String[] args) {
		/*
		 * 아래와 같이 출력되는 프로그램을 작성하시오.
		 * 
		 * 출력 [Copy] 
		 * 2 3 4 5 6 
		 * 3 4 5 6 7 
		 * 4 5 6 7 8 
		 * 5 6 7 8 9
		 * 6 7 8 9 10
		 * 
		 * i와 j값을 둘 다 활용하여 식을 만들어 본다.
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


