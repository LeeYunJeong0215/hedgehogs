package sec07_user_define_exception;

//�Ϲݿ��ܴ� Exception ���, ���࿹�ܴ� RunTimeException ���
public class BalanceInsufficientsExecption extends Exception {
	public BalanceInsufficientsExecption(){
		
	}
	public BalanceInsufficientsExecption(String message){
		super(message);
	}
}
