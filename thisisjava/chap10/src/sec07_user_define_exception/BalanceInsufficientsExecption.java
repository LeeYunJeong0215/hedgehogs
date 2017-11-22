package sec07_user_define_exception;

//일반예외는 Exception 상속, 실행예외는 RunTimeException 상속
public class BalanceInsufficientsExecption extends Exception {
	public BalanceInsufficientsExecption(){
		
	}
	public BalanceInsufficientsExecption(String message){
		super(message);
	}
}
