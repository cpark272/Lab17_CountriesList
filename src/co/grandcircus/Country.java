package co.grandcircus;

public class Country {
	
	// Instance variables
	private String countryName;
	private int countryPop;
	
	// Constructor for Country class to initialize the values of the object
	public Country(String countryName, int countryPop) {
		this.countryName = countryName;
		this.countryPop = countryPop;
		
	}
	
	// Getter for country name
	public String getCountryName() {
		return countryName;
	}
	
	// Setter for country name
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	// Getter for country population
	public int getCountryPop() {
		return countryPop;
	}
	
	// Setter for country population
	public void setCountryPop(int countryPop) {
		this.countryPop = countryPop;
	}
	
	// Override method for toString
	@Override
	public String toString() {
		return countryName + " (pop " + countryPop + ")";
	}
	

}
