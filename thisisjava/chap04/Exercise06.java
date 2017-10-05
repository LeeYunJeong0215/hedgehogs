package chap04_Exercise;

public class Exercise06 {

	public static void main(String[] args) {
		//my code
		char asterisk = '*';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(asterisk);
				if (i == j) {
					break;
				}
			}
			System.out.println();
		}
		//yun code
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}