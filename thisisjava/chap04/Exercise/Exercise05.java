package chap04_Exercise;

public class Exercise05 {

	public static void main(String[] args) {
		// 4x + 5y = 60의 모든 해를 구하기
		// 중첩 for문, x와 y는 10이하 자연수
		int x, y;
		System.out.println("4x + 5y = 60 의 모든 해");
		System.out.println();

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {

					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

	}

}
