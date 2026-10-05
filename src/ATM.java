/*
 * Class: ATM - Acts an as ATM to test withdrawals
 * 
 * Authors: Marcus Caro, Trisha Varadaraj 
 * Date: 10/5/2026
 */

public class ATM {
	public BankAccount account;

	/*
	 * Initialize ATM object with $500 in account
	 */
	public ATM() {
		account = new BankAccount(500);
	}
	
	/*
	 * Catch exception if not enough money in account to withdraw requested amount
	 */
	public void handleTransactions() {
		try {
			account.withdraw(600);
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}	
		
		try {
			account.quickWithdraw(600);
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.handleTransactions();
	}
	
}
