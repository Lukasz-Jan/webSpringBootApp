package webSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interfaces.Address;
import interfaces.AddressGenerator;

public class AddressGenerator_Impl implements AddressGenerator {

	public static final Logger log = LoggerFactory.getLogger(AddressGenerator_Impl.class);

	@Override
	public Address generateAddress() {

		int rand = 8;
		while (rand > 6) {

			rand = (int) (Math.random() * 10);
			log.info("rand: " + rand);
		}
		
		String addressStr = streets.get(rand) + " " + houseNumGen(200) + homeNumGen(200);
		

		Address adr = new Address_Impl(addressStr);

		return adr;
	}

	private int houseNumGen(int max) {

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
