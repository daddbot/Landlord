package albany.edu.project.property;

public class ListingInfo {
	
	private int squareFeet;
	private int beds;
	private int baths;
	private int rent;
	private String description;
	private final int BASERENT = 800;
	
	
	public ListingInfo(int squareFeet, int beds, int baths) {
		this.squareFeet = validate(squareFeet);
		if (beds > 5)
			beds = 5;
		this.beds = validate(beds);
		this.baths = validate(baths);
		// default rent based on No. of bedrooms
		rent = (int)(BASERENT + (BASERENT*((beds-1) * .25)));
	}
	
	public ListingInfo(int squareFeet, int beds, int baths, int rent) {
		this(squareFeet, beds, baths);
		// default rent based on No. of bedrooms
		this.rent = rent;
	}
	
	
	//copy constructor
	public ListingInfo(ListingInfo o) {
		squareFeet = o.squareFeet;
		beds = o.beds;
		baths = o.baths;
		rent = o.rent;
		if (o.description != null) 
			description = o.description;
	}
	
	
	private int validate(int value) {
		if (value < 1) {
			return 1;
		}
		else return value;
	}
	
	
	public void  setDescription(String description) {
		this.description = description;
	}
	
	public int getRent() {
		return rent;
	}
	
	public String toString() {
		// headline
		String ad = squareFeet+" square foot Apartment - "+beds+" Bed/"+baths+" Bath.\n";
		if (description != null) {
			ad = ad+description;
			return ad;
			
		}
		return ad;
	}
	
	

}
