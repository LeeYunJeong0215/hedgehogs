package sec06.exam01_array_bylist;

public class ArrayCreatByValueListExample {

	public static void main(String[] args) {
		//배열선언(바로 값 목록 선언)
		int[] scores = { 83, 90, 87 };
	
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		//for문 이용 배열내의 값 총합계산
		for(int i=0; i<3; i++){
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		//평균계산
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		

	}

}
