package albany.edu.project.property;
import albany.edu.project.people.*;

import java.util.ArrayList;

public class Unit {

	//to do - Payment, Listing classes variables
	private String name;
	private ListingInfo listingInfo;
	private Address address;
	private Tenant tenant;
	

	public Unit(String name, Address address, ListingInfo info) {
		this.name = name;
		this.listingInfo = info;
		this.address = address;
	}
	
	public Unit(String name, Address address) {
		this.name = name;
		this.address = address;
		// default listing given 1 bedroom specifications
		listingInfo = new ListingInfo(700, 1, 1);
	}
	
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;	
		this.tenant.setMonthlyRent(listingInfo.getRent());
	}
	
	public void setVacant() {
		this.tenant = null;
	}
	
	public String getName() {
		return name;
	}

	public ListingInfo getListingInfo() {
		return listingInfo;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Tenant getTenant() {
		return tenant;
	}

	public void setListingInfo(ListingInfo listingInfo) {
		this.listingInfo = listingInfo;
	}

	public boolean isCollectingRent(){
		if (tenant == null) 
			return false;
		else 
			return true;
	}
	
	@Override
	public String toString() {
		return address.getStreetNumber()+"\nApartment "+name+
				address.getCity()+", "+address.getState()+" "+
				address.getZipCode();
		
	}

}
