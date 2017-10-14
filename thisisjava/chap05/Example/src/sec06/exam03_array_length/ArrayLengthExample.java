package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		//배열생성 후 배열변수이름.length를 이용해서 총합과 평균 구하기.
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++){
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
