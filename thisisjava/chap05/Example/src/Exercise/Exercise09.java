package Exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//학생수와 각 학생의 점수를 입력받아 최고점수 및 평균점수를 구하는 프로그램
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1){
				//학생수
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2){
				//점수입력
				for(int i=0; i<scores.length; i++){
					System.out.print("scores[" + i + "] : ");
					scores[i] = scanner.nextInt();
				}
				
			}else if(selectNo == 3){
				//점수리스트(입력된 점수값 보여주기)
				for(int i=0; i<scores.length; i++){
					System.out.print("scores[" + i + "] : ");
					System.out.println(scores[i]);
				}
			}else if(selectNo == 4){
				//분석(최고점수, 평균)
				
				//1. 최고점수
				int max = 0;
				for(int i=0; i<scores.length; i++){
					//teacher code( 삼항연산자를 이용한 최대값 출력 )
					//max = (max<scores[i])?scores[i]:max;
					if(max < scores[i]){
						max = scores[i];
					}
				}
				System.out.println("최고점수 : " + max);
				
				//2. 평균
				int sum = 0;
				for(int score : scores){
					sum += score;
				}
				//double avg = (double)sum / studentNum;
				double avg = (double)sum / scores.length;
				System.out.println("평균점수 : " + avg);
			}else if(selectNo == 5){
				run = false;
			}else{
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
