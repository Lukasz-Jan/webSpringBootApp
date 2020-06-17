package webSpringBootApp;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interfaces.Person;
import interfaces.PersonGenerator;

public class PersonGenerator_Impl implements PersonGenerator {

	public static final Logger log = LoggerFactory.getLogger(PersonGenerator_Impl.class);
	
	@Override
	public Person generatePerson() {

		int size = this.persons.size() -1;
		int rand = 9;
		
		while (rand > size) {

			rand = (int) (Math.random() * 10);
			log.info("rand: " + rand);
		}
		
		Person per = new Person_Impl(this.persons.get(rand));
		return per;
	}

}
