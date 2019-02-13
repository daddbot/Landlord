package albany.edu.project.people;
import albany.edu.project.finance.*;
import albany.edu.project.property.*;

import java.awt.List;
import java.util.ArrayList;

public class LandLord extends Person implements Billable<Double>{
	
	private static LandLord INSTANCE = null;
	private int counter;
	private ArrayList<Property> properties;
	private Account account;
		
	
	private LandLord(String name, Account account) {
		//private constructor for singleton
		super(name);
		counter++;
		this.account = account;
		properties = new ArrayList();
	}
	
	// use of keyword synchronized prevents instantiation
	// of multiple LandLord objects in case of concurrent processing
	public synchronized static LandLord getInstance
						(String name, Account account) {
		if (INSTANCE == null) {
			INSTANCE = new LandLord(name, account);
		}
		return INSTANCE;
	}
	
	public void addProperty(Property property) {
		properties.add(property);
	}
	
	
	public void removeProperty(Property property) {
		properties.remove(property);
	}
	
	
	public void collectRents() {
		// polymorphically process rental payments for property objects 
		
		for (Property property : properties) {
			System.out.println("***Payments for "+ property+"***\n");
			
			if (property instanceof TownHouse){
				TownHouse th = (TownHouse)property;
				//do not collect rent if vacant
				if (th.getTenant() != null)
					account.deposit(th.getTenant().autoPay());
			}
			
			else if (property instanceof TwoFamily) {
				
				TwoFamily tf = (TwoFamily)property;
				//do not collect rent if vacant
				if (tf.getUnit1().getTenant() != null) {
					System.out.println("Unit:                               "+tf.getUnit1().getName());
					account.deposit(tf.getUnit1().getTenant().autoPay());
				}
				if (tf.getUnit2().getTenant() != null) {
					System.out.println("Unit:                               "+tf.getUnit2().getName());
					account.deposit(tf.getUnit2().getTenant().autoPay());
				}
				
			}
		}
	}
	
	
	/**
	 * returns a total of amounts paid
	 * on yearly property tax. CountyTax object that would 
	 * receive payment is not implemented but
	 * this method will deduct money from landlord account
	 * to demonstrate use of Billable interface
	 */
	public Double autoPay() {
		Double total = 0.00;
		for (Property p : properties) {
			Double taxes = (p.getYearlyTaxes());
			
			Double amountDrawn = account.withdraw(taxes);
			if (amountDrawn == 0.00) {
				System.out.println("Insufficient funds to complete payments");
				break;
			}
			else {
				total = total + amountDrawn;
				System.out.println("$"+amountDrawn+" in taxes paid on "+p);
			}
		}
		return total;
	}
	
	
	
	public int getCounter() {
		return counter;
	}
	
	
	
}
