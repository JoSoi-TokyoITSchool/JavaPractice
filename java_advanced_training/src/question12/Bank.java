package question12;

public class Bank {
	// 残高情報 
	private int balance;
	// 全ての口座の残高情報 
	private int totalBalance = 0;

	// 初期残高 
	public Bank(int initialBalance) {
		this.balance = initialBalance;
		totalBalance += initialBalance;
	}

	// 入金処理 
	public void deposit(int amount) {
		balance += amount;
		totalBalance += amount;
	}

}
