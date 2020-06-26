package webSpringBootApp;

import org.springframework.web.bind.annotation.RestController;

import webSpringBootApp.data.interfaces.CountriesRepository;
import webSpringBootApp.data.interfaces.StudentProducer;
import webSpringBootApp.data.Student;
import webSpringBootApp.data.StudentProducer_Impl;
import webSpringBootApp.data.Countries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
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

//	spring-boot:run

//@RestController
@Controller
public class HelloController {

	@Autowired
	private StudentProducer stProd;

	public static final Logger log = LoggerFactory.getLogger(HelloController.class);

	// https://stackoverflow.com/questions/39077787/difference-between-the-annotations-getmapping-and-requestmappingmethod-requ

	// The preceding example explicitly specifies POST and GET for the two
	// endpoints. By default, @RequestMapping maps all HTTP operations.

	@RequestMapping("/")
	public String index() {

		// applicationContext.close();

		return "Hello from first application Hello Hello";
	}

	@RequestMapping("/hello")
	public String hello(Model model) {

		// StudentProducer stProd = new StudentProducer_Impl();

		List<Student> list = stProd.produceStudents();

		log.info(list.get(0).getAddresslist().get(0).getAddress());

		model.addAttribute("studentList_1", list);

		return "hello";
	}

	@Bean
	public CommandLineRunner demo(CountriesRepository repository) {

		return (args) -> {
			
			repository.findAll().forEach( c -> log.info(c.getCountryName()) );
		};

	}
}