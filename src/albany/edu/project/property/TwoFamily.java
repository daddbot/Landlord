package albany.edu.project.property;

import java.util.ArrayList;

import albany.edu.project.people.Address;
import albany.edu.project.people.Tenant;

public class TwoFamily extends Property {
	private Unit unit1;
	private Unit unit2;
	
	public TwoFamily(Address address, String unit1Name, String unit2Name){
		super(address);
		unit1 = new Unit(unit1Name, address);
		unit2 = new Unit(unit2Name, address);
	}
	
	
	
	public Unit getUnit1() {
		return unit1;
	}
	
	public Unit getUnit2() {
		return unit2;
	}
	
	
	
	
	/**
	public void setUnit1Info(ListingInfo info, Tenant tenant) {
		this.unit1.setListingInfo(info);
		this.unit1.setTenant(tenant);
	}
	
	public void setUnit1Info(ListingInfo info) {
		this.unit1.setListingInfo(info);
	}

	
	public void setUnit2Info(ListingInfo info, Tenant tenant) {
		this.unit2.setListingInfo(info);
		this.unit2.setTenant(tenant);
	}
	
	public void setUnit2Info(ListingInfo info) {
		this.unit2.setListingInfo(info);
	}
	
	**/

		
	
}
