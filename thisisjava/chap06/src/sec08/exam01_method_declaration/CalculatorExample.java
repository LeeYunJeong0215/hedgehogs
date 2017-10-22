package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(10, 20);
		System.out.println("result1 : " + result1);
		
		//int 매개변수를 받는 것이지만 byte형도 매개변수로 보내기 가능.
		//자동타입변환이 되기 때문.
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		

	}

}
