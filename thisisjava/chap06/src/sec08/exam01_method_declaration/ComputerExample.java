package sec08.exam01_method_declaration;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		Scanner scanner = new Scanner(System.in);
		
		//1.매개변수를 배열타입으로 선언한 것을 호출
		//1)배열을 만들어준 후 대입
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		//int result2 = myCom.sum1({1,2,3}) 오류발생
		//이미 배열타입으로 선언이 되어 있으므로 new 생성자를 이용해서
		//값을 줘야 하기 때문
		//2)매개변수를 넣는 곳에 직접 배열 생성
		int result2 = myCom.sum1(new int[] {1,2,3});
		System.out.println("result2 : " + result2);
		
		//2.매개변수를 배열을 생성하지 않고 값의 리스트만 넘겨주는 경우 호출
		int result3 = myCom.sum2(1,2,3);
		//int result3 = myCom.sum2({1,2,3}); 이건 오류발생
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
		
		//입력 받은 값을 매개변수로 사용하려는데 몇개를 입력받을지 모르면
		//'...'을 이용해서 매개변수를 선언하면 되겠구나.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result5 = myCom.sum2(num1, num2);
		System.out.println("result5 : " + result5);
		
		scanner.close();
	}
	

}
