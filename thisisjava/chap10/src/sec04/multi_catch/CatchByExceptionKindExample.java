package sec04.multi_catch;

public class CatchByExceptionKindExample {
	//다중 catch(발생되는 예외별로 예외처리코드를 다르게 하고 싶을 때)
	public static void main(String[] args) {
		try{
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			
			int result = value1 + value2;
			
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 매개값의 수가 부족합니다");
			System.out.println("[실행방법]");
			System.out.println("Java TryCatchFinallyRuntimeExceptionExample num1 num2");
			System.out.println("------------------------------------------------------");
		}catch(NumberFormatException e){
			System.out.println("숫자로 변환할 수 없습니다");
		}finally{
			System.out.println("다시 실행하세요");
		}
			
		}

}
