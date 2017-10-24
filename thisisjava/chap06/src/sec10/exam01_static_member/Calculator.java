package sec10.exam01_static_member;

public class Calculator {
	//정적 멤버 선언은 static을 앞에 붙이면 된다.
	static double pi = 3.14159;
	
	static int plus(int x, int y){
		return x+y;
	}
	static int minus(int x, int y){
		return x-y;
	}
}
