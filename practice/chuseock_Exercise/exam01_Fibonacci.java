package chuseock_Exercise;

public class exam01_Fibonacci {

	public static void main(String[] args) {
		/*[문제 1] for문을 이용한  Fibonacci 수열
		- 피보나치 수열이란 처음 두 항을 1과 1로 한 후, 
		그 다음 항부터는 바로 앞의 두 개의 항을 더해 만드는 수열을 말한다. 
		다음 수열을 for문을 사용하여 출력한다.
		 
		1  1  2  3  5  8  13  21  34  55	 
*/		
		//첫번째 풀이 : 배열사용
		int[] numbers = new int[10];
		int sum= 0;
		
		numbers[0] = 1;
		numbers[1] = 1;
		System.out.print(numbers[0] + ", " + numbers[1]);
		
		for(int i = 0; i<numbers.length-2; i++){
			sum = numbers[i] + numbers[i+1];
			System.out.print(", " + sum);
			numbers[i+2] = sum;	
		}
		//두번째 풀이 : 배열을 쓰지 않고 푸는 방법을 생각해보자
	}

}
