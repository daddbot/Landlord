package albany.edu.project.people;

import albany.edu.project.finance.Account;

public class Section8Tenant extends Tenant {
	
	private int monthlyIncome;
	
	public Section8Tenant (String firstName,String lastName, Account account, int monthlyIncome) {
		super(firstName,lastName, account);
		this.monthlyIncome = monthlyIncome;
		
	}
	
	private int getRentContributionAmount() {
		// Housing Choice Voucher program will pay the balance 
		// of a rent payment that exceeds 30% of a renters monthly income. 
		int threshHold = (int)(monthlyIncome * 0.3);
		int currentContribution;
		
		if (super.getMonthlyRent() > threshHold) 
			currentContribution = threshHold;
		else 
			currentContribution = super.getMonthlyRent();
		return currentContribution;
	}
	
	
	public Integer autoPay() 
	{
		// get Section8Tenant's contribution based on monthly salary
		int amountDue = getRentContributionAmount();
		System.out.println("Tenant:                             "+super.getName());
		System.out.println("Monthly Rent:                       $"+super.getMonthlyRent());
		
		if (super.getLinkedAccount().getBalance() < amountDue) {
			System.out.println("Rent payment failed. Contact Tenant"+this.getName()); 
			return 0;
		}
		else {
			super.getLinkedAccount().withdraw(amountDue);
					System.out.println("Contribution under Section 8:       $"+amountDue+"\nPaid in full\n");
			return amountDue;
		}
	}// end autoPay
	
	
	
}
