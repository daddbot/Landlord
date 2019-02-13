package albany.edu.project.people;

import albany.edu.project.finance.*;
import albany.edu.project.property.*;

import java.util.InputMismatchException;
import java.util.Scanner;




public class Test {

	public static void main(String[] args) {
		
		// create RentalPropertyFactory object
		RentalPropertyFactory factory = new RentalPropertyFactory();
		//create Bank object
		Bank bank = new Bank("key bank");
		
		
		//create singleton landlord object with account balance of $1000000
		Account l = new Account(1000000, bank);
		LandLord kreitzer = LandLord.getInstance("Kreitzer", l);
		
		
	
		// create two family property
		Address address = new Address("9 Elm Ave", "Albany", "NY","12209");
		TwoFamily elm = (TwoFamily)factory.getProperty(PropertyType.TWOFAMILY, address);
		
		//create account and tenant objects for two family property elm 
		Account t1 = new Account(10000, bank);
		Tenant pam = new Tenant("Pam","Smith", t1);
		
		Account t2 = new Account(3000, bank);
		//Section8Tenant must submit monthly income (3rd arg) 
		Tenant bob = new Section8Tenant("Bob","Lyons", t1, 3000);
		
		// add tenants Pam and Bob to Elm Ave property
		elm.getUnit1().setTenant(bob);
		elm.getUnit2().setTenant(pam);
		
		
		
		// create second two family property
		Address address1 = new Address("89 Pearl Street", "Albany", "NY", "12210");
		TwoFamily pearl = (TwoFamily)factory.getProperty(PropertyType.TWOFAMILY, address1);
	
		//create account and tenant objects for two family property pearl 
		Account t3 = new Account(10000, bank);
		Tenant fred = new Tenant("Fred","Mertz", t3);
		
		Account t4 = new Account(3000, bank);
		Tenant louis = new Section8Tenant("Louis","Tullie", t4, 2000);
		
		//add tenants Fred and Louis to Pearl Street property
		pearl.getUnit1().setTenant(fred);
		pearl.getUnit2().setTenant(louis);
		
		
		//create single family TownHouse property
		Address address2 = new Address("12 Manning Blvd", "Albany", "NY","12203");
		TownHouse manning = (TownHouse)factory.getProperty(PropertyType.TOWNHOUSE, address2);
		
		//create account and tenant objects for TownHouse manning
		Account t5 = new Account(4000, bank);
		Tenant lucy = new Tenant("Lucy","Kovachic", t5);
		
		// add tenant lucy to 
		manning.setTenant(lucy);
		

		// assign all properties to landlord krieitzer
		kreitzer.addProperty(elm);
		kreitzer.addProperty(manning);
		kreitzer.addProperty(pearl);

		//collect rent on all properties
		kreitzer.collectRents();
		
		//change yearly taxes for Pearl St. property from default to 10000
		pearl.setYearlyTaxes(10000);
		
		// pay yearly property tax
		kreitzer.autoPay();
	
	}
	

	}
	
	
	/**
	public static void main(String[] args) {
		
		// declare variables
		Bank bank = new Bank("key bank");
		Account l = new Account(1000000, bank);
		//Static method must be used to generate instance singleton class LandLord
		LandLord kreitzer = LandLord.getInstance("Kreitzer", l);
		RentalPropertyFactory factory = new RentalPropertyFactory();
		TownHouse townHouse;
		TwoFamily twoFamily;
	
		//prompt user for settings
		Scanner keyboard = new Scanner(System.in);
		System.out.print("***Create a Property***\n");
		boolean createMore = true;
		while (createMore = true) {
			
			System.out.print("Enter address and street: ");
			String street = keyboard.next();
			System.out.print("Enter City");
			String city = keyboard.next();
			System.out.print("Enter State");
			String state = keyboard.next();
			System.out.print("Zip Code");
			String zip = keyboard.next();
			
			Address address = new Address(street, city, state, zip);
			System.out.print("Enter property type: (TH = TownHouse, TF = Two Family)");
			String response = keyboard.next();
			
			//validate input for property type
			while (!response.equalsIgnoreCase("TF") && !response.equalsIgnoreCase("TH")) {
				System.out.println("Invalid Response. Enter TH for Town House or TF for Two Family");
				response = keyboard.next();
			}
			if (response.equalsIgnoreCase("TH")) {
				townHouse = (TownHouse)factory.getProperty(PropertyType.TOWNHOUSE, address);
				
				System.out.print("Add Tenant? (Y or N)");
				response = keyboard.next();
				
				while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")) {
					System.out.println("Invalid Response. Enter Y to add Tenant N to leave vacant");
					response = keyboard.next();
				}
				
				if (response.equals("Y")) {
					System.out.println("***Create autoPay account for tenant***");
					int amount;
					boolean continueLoop = true;
					do
						try 
						{
							System.out.println("Enter Tenant Balance");
							amount = keyboard.nextInt();
							continueLoop = false;
						}
						catch (InputMismatchException mm)
						{
							System.err.printf("%nException: %s%n", mm);
							keyboard.nextLine(); // discard input 
							System.out.printf("You must enter numbers.%n");
						}
					while(continueLoop = true);
					// create tenat account
					Account tenantAccount = new Account(amount, bank);
					
					System.out.println("Enter tenant name: ");
					response = keyboard.next();
					//create tenant
					
					
					}
				Tenant pam = new Tenant("pam", t1);
				}
			}

			else 
				twoFamily = (TwoFamily)factory.getProperty(PropertyType.TWOFAMILY, address);
			
			System.out.println("***Enter Tenants for property***");
			
			
		
}
**/