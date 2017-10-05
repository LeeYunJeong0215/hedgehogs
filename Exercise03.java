package chap04_Exercise;

public class Exercise03 {

	public static void main(String[] args) {
		//1~100사이의 3의 배수의 총합
		int sum = 0;
		
		for(int i = 1; i<=100; i++){
			if(i % 3 == 0){
				sum += i;
			}
		}
		System.out.println("1~100까지 3의 배수의 총합 : " + sum);
	}

}
