package Repetition_Control_Statement2;

public class RepetitionControlApprasial08 {

	public static void main(String[] args) {
/* 구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
출력형식 예) 2□*□1□=□□2□□□ (□는 공백을 나타내는 것임)​
 
출력   [Copy]
2 * 1 =  2   2 * 2 =  4   2 * 3 =  6   2 * 4 =  8   2 * 5 = 10
3 * 1 =  3   3 * 2 =  6   3 * 3 =  9   3 * 4 = 12   3 * 5 = 15
4 * 1 =  4   4 * 2 =  8   4 * 3 = 12   4 * 4 = 16   4 * 5 = 20
 */
	//줄맞추기가 너무 힘들었다...
	for(int i=2; i<=4; i++){
		for(int j=1; j<=5; j++){
				System.out.printf(i +" * " + j + " = ");
				System.out.printf("%2d" + "   ", (i*j));
			}
		System.out.println();
		}

	}

}
