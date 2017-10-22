package sec08.exam01_method_declaration;

public class Computer {
	//매개변수의 수를 모를 경우
	//1. 매개변수를 배열타입으로 선언
	int sum1(int[] values){
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum;
	}
	//2. 매개변수를 배열을 생성하지 않고 값의 리스트만 넘겨주는 방법
	int sum2(int ... values){
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum;
	}
}
