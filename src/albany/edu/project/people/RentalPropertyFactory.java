package albany.edu.project.people;

import albany.edu.project.property.*;

public class RentalPropertyFactory {

	public Property getProperty(PropertyType type, Address address) {
		
		if (type == PropertyType.TOWNHOUSE) {
			ListingInfo info = new ListingInfo(2000, 4, 2, 1800);
			TownHouse townHouse = new TownHouse(address, info);
			return townHouse;
		}
		
		else //type is TWOFAMILY
			//(type == PropertyType.TWOFAMILY) 
			{
			ListingInfo info1 = new ListingInfo(1300, 1, 3, 1200);
			ListingInfo info2 = new ListingInfo(info1);
			TwoFamily twoFamily = new TwoFamily(address, "Apt 1", "Apt 2");
			twoFamily.getUnit1().setListingInfo(info1);
			twoFamily.getUnit2().setListingInfo(info2);
			return twoFamily;
		}
		
	
		//TO DO
		//if (type == PropertyType.APTBLDG) {
				
	}
}
