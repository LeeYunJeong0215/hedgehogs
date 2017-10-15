package sec06.exam08_advance_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		//향상된 for문을 이용해 sum,avg 구하기
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		
		for(int score :  scores){ //타입 변수 : 대입할 배열
			sum += score;
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
