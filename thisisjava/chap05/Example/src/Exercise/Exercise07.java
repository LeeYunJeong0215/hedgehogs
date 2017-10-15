package Exercise;

public class Exercise07 {

	public static void main(String[] args) {
		//배열의 최대값 구하기
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
		 * 1시간동안 고민했는데 왜 잘못된건지 확 와닿지 않는다.
		 * 재분석이 필요함.
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

	
