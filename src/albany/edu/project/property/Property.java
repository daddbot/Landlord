package albany.edu.project.property;


import albany.edu.project.people.*;

public abstract class Property {

	private String nickName;
	private Address address;
	private int lotSize;
	private double yearlyTaxes;
	
	
	
	public Property(Address address) {
		this.address = address;
		nickName = "Default Name";
		this.yearlyTaxes = 8000.00;
	}
	
	public Property(Address address, String nickName) {
		this.address = address;
		this.nickName = nickName;
	}
	
	public Property(Address address, int lotSize, Double yearlyTaxes) {
		this.address = address;
		this.lotSize = lotSize;

	}
	
	public double getYearlyTaxes() {
		return yearlyTaxes;
	}
	
	public void setYearlyTaxes(double taxes) {
		yearlyTaxes = taxes;
	}
	
	public String toString() {
		return address.toString();
	}
}
