package sec08.exam03_method_call;

public class Calculator {
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	double avg(int x, int y){
		//avg는 double이므로 double로 형변환하여 받는다
		double sum = plus(x, y);//plus()메소드 내부 호출
		double result = sum / 2.0;
		return result;
	}
	void execute(){
		//avg()메소드 내부 호출을 통해 값을 받는다.
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}
	void println(String message){//String으로 형을 표시안했더니
								//앞 뒤 모두 오류가 났다.
		System.out.println(message);
	}
}
