/**
 * The Bank Class proviedes variables and 
 * methods for storing bank name and 
 * address information.
 */

package albany.edu.project.finance;
import albany.edu.project.people.Address;


public class Bank {
	private String name;
	private Address address;
	
	public Bank(String name) {
		this.name = name;
	}
	
	// constructor accepts arguments for name and address
	public Bank(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	// sets name
	public void setName(String name) {
		this.name = name;
	}
	
	// sets address
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// returns name
	public String getName() {
		return name;
	}

	// returns address
	public Address getAddress() {
		return address;
	}
	


}
