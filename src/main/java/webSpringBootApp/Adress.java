package webSpringBootApp;

public class Adress {

	private String city;
	private String street;
	private Integer houseNumber;
	private Integer homeNumber;
	
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Integer getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(Integer homeNumber) {
		this.homeNumber = homeNumber;
	}

	public Adress(String city, String street, Integer houseNumber, Integer homeNumber) {

		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.homeNumber = homeNumber;
	}
	
	

}
