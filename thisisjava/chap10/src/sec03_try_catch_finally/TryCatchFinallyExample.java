package sec03_try_catch_finally;
//일반예외(예외처리 코드가 없다면 컴파일 오류)처리
public class TryCatchFinallyExample {
	public static void main(String[] args){
		try{
			Class clazz1 = Class.forName("java.lang.String2");
			//Class clazz2 = Class.forName("java.lang.String");
			System.out.println("클래스가 존재합니다");
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
