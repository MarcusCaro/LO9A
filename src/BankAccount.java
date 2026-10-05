/*
 * Class: BankAccount - Tracks balance and throws exception if withdraw
 * requests more than in account
 * 
 * Authors: Marcus Caro, Trisha Varadaraj 
 * Date: 10/5/2026
 */
public class BankAccount {
	private double balance;
	
	/*
	 * Constructor taking balance as a parameter
	 */
	public BankAccount(double balance) {
		this.balance = balance;
	}

	/*
	 * Withdraw function that might throw a custom exception if balance is too low
	 */
	public void withdraw(double amount) throws NegativeBalanceException {
		if (amount > balance) {
			throw new NegativeBalanceException(amount - balance);
		}
		
		balance -= amount;
	}
	
	/*
	 * quickWithdraw function that might throw a custom exception if balance is too low
	 */
	public void quickWithdraw(double amount) throws NegativeBalanceException {
		if (amount > balance) {
			throw new NegativeBalanceException();
		}
		
		balance -= amount;
	}
}
