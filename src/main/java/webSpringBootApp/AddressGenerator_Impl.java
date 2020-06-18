package webSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interfaces.Address;
import interfaces.AddressGenerator;

public class AddressGenerator_Impl implements AddressGenerator {

	public static final Logger log = LoggerFactory.getLogger(AddressGenerator_Impl.class);

	@Override
	public Address generateAddress() {

		int streetsSize = streets.size()-1;
		int citiesSize = cities.size()-1;
		
		if(streetsSize != citiesSize) { 
			log.error("streets size not equal to cities size");
		}
		
		log.info("Streets size: " + (streetsSize + 1));
		int rand = streets.size();
		while (rand > streetsSize) {

			rand = (int) (Math.random() * 10);
		}
		
		log.info("random street: " + streets.get(rand));
		
		String addressStr = streets.get(rand);		
		
		rand = cities.size();
		
		while(rand > citiesSize) {
			
			rand = (int)( Math.random()*10);
		}
		log.info("random City: " + cities.get(rand));
		
		String city = cities.get(rand);

		
		int homeNumber = homeNumGen(100); 
		int flatNumber = flatNumGen(100);
		
		Address adr = new Address_Impl(addressStr, city, homeNumber, flatNumber);

		return adr;
	}

	private int flatNumGen(int max) {

		int rand = (int) (Math.random() * max);
		log.info("rand: " + rand);
		return rand;
	}
	
	private int homeNumGen(int max) {

		int rand = (int) (Math.random() * max);
		log.info("rand: " + rand);
		return rand;
	}	
}
