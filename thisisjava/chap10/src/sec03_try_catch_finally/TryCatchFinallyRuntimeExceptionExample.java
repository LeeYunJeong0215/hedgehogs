package sec03_try_catch_finally;
//실행예외(컴파일하는 과정에서 예외 처리 코드를 검사하지 않는 예외)처리
public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try{
			//예외발생가능코드
			data1 = args[0];
			data2 = args[1];
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 매개값의 수가 부족합니다");
			System.out.println("[실행방법]");
			System.out.println("Java TryCatchFinallyRuntimeExceptionExample num1 num2");
			System.out.println("------------------------------------------------------");
		}
		try{
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환할 수 없습니다");
			System.out.println("------------------------------------------------------");
		}finally{
			System.out.println("다시 실행하세요.");
			System.out.println("------------------------------------------------------");
		}
	}	

}
