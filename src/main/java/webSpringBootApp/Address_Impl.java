package webSpringBootApp;

import interfaces.Address;


public class Address_Impl implements Address{

	private String address;
	private String city;
	private int houseNumber;
	private int flatNumber;

	public String getCity() {
		return city;
	}






	public Address_Impl(String address) {
		this.address = address;
	}


	
	public Address_Impl(String address, String city, int houseNumber, int flatNumber) {

		this.address = address;
		this.city = city;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
	}






	public Address_Impl(String address, String city) {

		this.address = address;
		this.city = city;
	}

	public int getHouseNumber() {
		return this.houseNumber;
	}

	public int getFlatNumber() {
		return this.flatNumber;
	}

	@Override
	public String getAddress() {

		return this.address;
	}
}
