package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum;
	
	//앞글자 소문자로, static()아님, 괄호 없음
	//정적 초기화 블록
	static{
		
		//String info = company + " - " + model; String 써줄 필요x
		info = company + " - " + model;
		
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum += i;
		}
		from1To10Sum = sum;
	}
}
