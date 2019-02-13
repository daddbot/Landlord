/**
 * The CheckingBankAccount Class provides
 * methods and variables for managing 
 * checking accounts.
 */

package albany.edu.project.finance;

public class Account {

	private double balance;
	private Bank bank;
	
	
	//constructor accepts arguments for initial deposit amount and Bank
	public Account(double initialDeposit, Bank bank) {
		if (initialDeposit < 0) 
			balance = 0.00;
		else
			balance = initialDeposit;
		this.bank = bank;
	}
	
	
	// returns balance
	public double getBalance() {
		return balance;
	}
	
	// returns Bank
	public Bank getBank() {
		return bank;
	}
	
	// adds to balance
	public void deposit(double amount) {
		if (amount < 0)
			amount = 0;
		balance = balance + amount;
	}
	
	// subtracts from balance
	public double withdraw(double amount) {
		if (amount < 0) {
			amount = 0;
			return 0.00;
		}
		if (amount > balance) {
			System.out.println("Insufficient Funds");
			return 0;
		}
		else {
			balance = balance - amount;
			return amount;
		}
	}
	
}