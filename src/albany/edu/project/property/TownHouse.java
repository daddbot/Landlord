package albany.edu.project.property;

import albany.edu.project.people.Address;
import albany.edu.project.people.Tenant;

public class TownHouse extends Property {
	private ListingInfo listingInfo;
	private Tenant tenant;
	
	
	public TownHouse (Address address, ListingInfo info) {
		super(address);
		listingInfo = info;
	}
	
	public Tenant getTenant() {
		return tenant;
	}
	
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;	
		this.tenant.setMonthlyRent(listingInfo.getRent());
	}

}
