package webSpringBootApp;

import interfaces.Person;

public class Person_Impl implements Person{

	public Person_Impl(String person) {

		this.person = person;
	}

	private String person;

	@Override
	public String getPerson() {

		return this.person;
	}
	
	
}
