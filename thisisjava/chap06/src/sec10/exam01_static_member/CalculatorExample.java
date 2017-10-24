package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		//정적멤버 사용시에는 클래스이름. 으로 사용하면 된다.
		//new 연산자를 이용해 객체를 생성해줄 필요가 없다.(객체내에 존재하는게 아니므로)
		double result1 = 10 * 10 * Calculator.pi;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("원의 넓이 : " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
