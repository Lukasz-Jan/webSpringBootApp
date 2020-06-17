package webSpringBootApp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interfaces.Address;
import interfaces.AddressGenerator;
import interfaces.Person;
import interfaces.PersonGenerator;
import interfaces.StudentProducer;

public class StudentProducer_Impl implements StudentProducer {

	
	public static final Logger log = LoggerFactory.getLogger(StudentProducer_Impl.class);	 
	
	
	public Student produceStudent(int id) {
		
		AddressGenerator adrGen = new AddressGenerator_Impl();
		Address adr1 = adrGen.generateAddress(); 
		Address adr2 = adrGen.generateAddress();
		
		List<Address> addressList= new ArrayList<Address>();
		addressList.add(adr1);
		addressList.add(adr2);
		
		
		PersonGenerator perGen = new PersonGenerator_Impl(); 
		Person per = perGen.generatePerson();
		

		
		Student st = new Student(id, per.getPerson(), generateAge(100), addressList );
		
		return st;
	}
	
	
	public List<Student> produceStudents() {
		
		List<Student> studentsList = new ArrayList<Student>();
		
		for(int i = 0; i < 5; i++) {
			
			Student st = produceStudent(i);
			studentsList.add(st);
		}
		
		return studentsList;
	}
	
	
	private int generateAge(int max) {

		int rand = (int) (Math.random() * max);
		log.info("rand: " + rand);

		return rand;
	}	
}
