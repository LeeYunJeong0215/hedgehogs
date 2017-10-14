package sec06.exam04_main_argument;

public class MainStringArrayExample {

	public static void main(String[] args) {
		//main()메소드에 매개변수를 줘서 합 구하기
		if(args.length != 2){
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayExample num1 num2");
			System.exit(0);//프로그램 강제종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
