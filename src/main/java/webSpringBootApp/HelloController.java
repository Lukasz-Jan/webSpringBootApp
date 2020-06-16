package webSpringBootApp;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//	http://localhost:8080/hello
//	http://192.168.0.38:8080/start

//	https://github.com/spring-projects/spring-boot/issues/1239

//	https://spring.io/guides/gs/handling-form-submission/
//	https://stackoverflow.com/questions/26794334/spring-boot-mvc-template-not-loading-404-not-found
//	https://stackoverflow.com/questions/4367665/java-maven-rebuild-dependency
//	https://spring.io/guides/gs/handling-form-submission/
//	https://stackoverflow.com/questions/26794334/spring-boot-mvc-template-not-loading-404-not-found



//	https://stackoverflow.com/questions/46060830/cannot-display-the-index-html-page-in-spring-boot
//	https://mkyong.com/spring-boot/spring-boot-slf4j-logging-example/

//@RestController
@Controller
public class HelloController {

	public static final Logger log = LoggerFactory.getLogger(HelloController.class);
			
	//	https://stackoverflow.com/questions/39077787/difference-between-the-annotations-getmapping-and-requestmappingmethod-requ	
	
	@RequestMapping("/")
	public String index() {
		
		
		//applicationContext.close();
		
		return "Hello from first application Hello Hello";
	}
	

	@RequestMapping("/hello")
	public String hello(Model model) {
		
		//List<String> list = Arrays.asList("first", "second", "third", "fourth", "fifth");
		
		//log.debug(list.toString());
		
		
		List<Student> list = studentProducer();
		log.info(list.get(0).getAddresslist().get(0).getCity());
		
		model.addAttribute("studentList_1", list);
		
		return "hello";
	}
	
	
	private List<Student> studentProducer() {
		
		Student st1 = new Student(1, "Marek Łoś",        70,  	generateAddressList("Gdańsk", "Wajdeloty", 3, 3 ));
		Student st2 = new Student(2, "Krzysztof Marcel", 44, 	generateAddressList("Kraków", "Wajdeloty", 3, 3 ));
		
		log.info(st1.getAddresslist().get(0).toString());
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(st1);	list.add(st2);
		
		//log.info(list.get(0).getAddresslist().get(0).getCity());
		
		
		return list;
	}
	
	private Adress generateAddress(String city, String street, Integer houseNum, Integer homeNum) {
		
		Adress adr1 = new Adress(city, street, houseNum, homeNum);
		return adr1;
	}

	
	private List<Adress> generateAddressList(String city, String street, Integer houseNum, Integer homeNum) {
		
		Adress adr1 = generateAddress("Gdańsk",   "Wajdeloty", getRandom(100), getRandom(100));
		Adress adr2 = generateAddress("Warszawa", "Chrobrego", getRandom(100), getRandom(100));
		
		List<Adress> listAddress = new ArrayList();
		listAddress.add(adr1);
		listAddress.add(adr2);

		return listAddress;
	}


	private int getRandom(int max) { 

			int rand = (int) (Math.random()*max);
			log.info("rand: " + rand);
			
			return rand;
	}
}
