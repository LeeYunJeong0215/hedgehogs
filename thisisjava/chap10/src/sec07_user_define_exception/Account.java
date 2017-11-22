package sec07_user_define_exception;

public class Account {
	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientsExecption {
		if (balance < money) {
			throw new BalanceInsufficientsExecption
			("잔고부족 : " + (money - balance) + "원 모자람" + " getMessage()");
			
		}
		balance -= money;
		System.out.println("getMessage()");
	}

}
