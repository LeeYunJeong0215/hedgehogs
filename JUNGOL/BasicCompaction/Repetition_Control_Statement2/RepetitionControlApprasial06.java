package Repetition_Control_Statement2;

import java.util.Scanner;

public class RepetitionControlApprasial06 {

	public static void main(String[] args) {
		/*
		 * 10 이하의 과목수 n을 입력받은 후 n개 과목의 점수를 입력받아서 평균을 구하여 출력하고 평균이 80점이상이면
		 * "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오. 평균은 반올림하여 소수 첫째자리까지
		 * 출력한다.​
		 * 
		 * 입력 [Copy] 
		 * 4
		 * 75 80 85 90 
		 * 
		 * 출력 [Copy]
		 * avg : 82.5 
		 * pass
		 */

		Scanner scanner = new Scanner(System.in);

		int subjects = scanner.nextInt();
		int sum = 0;

		for (int i = 0; i < subjects; i++) {
			int scores = scanner.nextInt();
			sum += scores;
		}
		double avg = (double) sum / subjects;
		System.out.printf("avg : " + "%.1f", avg);
		System.out.println();
		
		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		scanner.close();
	}

}
