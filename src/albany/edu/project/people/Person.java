package albany.edu.project.people;
import java.util.ArrayList;

import albany.edu.project.finance.Account;
import albany.edu.project.property.Property;

public class Person {

	private ArrayList inventory;
	private Address address;
	private double cash;
	private String name;
	
	
	public Person() {
		this.name = "default Name";
		inventory = new ArrayList();
		cash = 5;
	}
	public Person(String name) {
		this.name = name;
		inventory = new ArrayList();
		cash = 5;
	}
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public Person (String name, ArrayList invent, double cash) {
		this.name = name;
		inventory = invent;
		this.cash = cash;
	}
	
	public void removeFromInventory(Object item) {
		if(inventory.contains(item)) 
			inventory.remove(item);
		else
			System.out.println("Item not found");
	}
	
	public boolean pay(double amount) {
		if (amount > cash) {
			System.out.println("Can't pay");
			return false;
		}
		else 
			cash = cash - amount;
		return true;
	}
	
	
	public ArrayList getInventory() {
		return inventory;
	}

	public Address getAddress() {
		return address;
	}

	public double getCash() {
		return cash;
	}

	public String getName() {
		return name;
	}

	public void setInventory(ArrayList inventory) {
		this.inventory = inventory;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addCash(double cash) {
		this.cash = cash;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
		
}
