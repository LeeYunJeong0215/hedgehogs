package sec08.exam01_method_declaration;

public class Calculator {

	//리턴값, 매개변수가 없는 메소드
	void powerOn(){
		System.out.println("전원을 켭니다");
	}
	//리턴값, 매개변수가 있는 메소드
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
}
