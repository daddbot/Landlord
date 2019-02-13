package albany.edu.project.people;
import albany.edu.project.finance.*;


public class Tenant extends Person implements Billable<Integer>{
	
	private Account linkedAccount;
	private int monthlyRent;
	
	public Tenant(String firstName,String lastName, Account account) {
		super(firstName);
		linkedAccount = account;
	}
	

	public void setMonthlyRent(int amount) {
		monthlyRent = amount;
	}
	
	
	public int getMonthlyRent() {
		return monthlyRent;
	}
	
	public Account getLinkedAccount() {
		return linkedAccount;
	}
	
	public Integer autoPay() {
		System.out.println("Tenant:                             "+super.getName());
		if (linkedAccount.getBalance() < monthlyRent) {
			System.out.println("Rent payment failed. Contact tenant"); 
			return 0;
		}
		else {
			linkedAccount.withdraw(monthlyRent);
			System.out.println("Monthly Rent:                       $"+getMonthlyRent()+"\nPaid in full\n");

			return monthlyRent;
		}
	}
	

}
