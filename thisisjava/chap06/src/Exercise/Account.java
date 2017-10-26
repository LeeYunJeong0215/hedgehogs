package Exercise;

public class Account {
	private int balance;
	static final int MIN_BALANCE;
	static final int MAX_BALANCE;
	
	static {
		MIN_BALANCE = 0;
		MAX_BALANCE = 1000000;
	}
		
	public void setBalance(int balance){
		if(balance <= MIN_BALANCE || balance >= MAX_BALANCE){
			this.balance = getBalance();
		}else{
			this.balance = balance;
		}
	}
	public int getBalance(){
		return balance;
	}
}
