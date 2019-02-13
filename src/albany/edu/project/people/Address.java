package albany.edu.project.people;

/** 
 * The Address class provides variables and 
 * methods for managing address information.
 */


public class Address {
	private String line1, line2, city, state, zipCode;
	
	// constructor accepts arguments for line1,
	// city, state, and zipCode
	public Address(String aLine1, String aCity, 
			String aState, String zip) {
		line1 = aLine1;
		city = aCity;
		state = aState;
		zipCode = zip;
	}
	
	// constructor accepts arguments for line1, line2,
	// city, state and zipCode
	public Address(String aLine1, String aLine2, 
			String aCity, String aState, String zip) {
		line1 = aLine1;
		line2 = aLine2;
		city = aCity;
		state = aState;
		zipCode = zip;
	}

	// sets line1
	public void setLine1(String aLine1){
		line1 = aLine1;
	}
	
	// sets line2
	public void setLine2(String aLine2){
		line2 = aLine2;
	}
	
	// sets city
	public void setCity(String aCity){
		city = aCity;
	}
	
	// sets state
	public void setState(String aState){
		state = aState;
	}
	
	// sets zipCode
	public void setZipCode(String zip){
		zipCode = zip;
	}
	
	// returns house number and street
	public String getStreetNumber() {
		if (line2 != null) 
			return line1+"\n"+line2;
		else
			return  line1;
	}
	
	// returns city
	public String getCity() {
		return city;
	}
	
	// returns state
	public String getState() {
		return state;
	}
	
	// returns zipCode
	public String getZipCode() {
		return zipCode;
	}
	
	//  returns full address
	public String toString() {
		if (line2 != null) {
			return line1+","+line2+", "+city+", "+state+" "+zipCode;
		}
		else 
			return line1+", "+city+", "+state+" "+zipCode;
	}	
	

}


