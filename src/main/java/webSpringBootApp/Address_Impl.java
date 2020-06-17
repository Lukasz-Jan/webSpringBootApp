package webSpringBootApp;

import interfaces.Address;


public class Address_Impl implements Address{

	private String address;

	public Address_Impl(String address) {
		this.address = address;
	}

	@Override
	public String getAddress() {

		
		return this.address;
	}
}
