package webSpringBootApp;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

//	http://localhost:8080/start
//	http://192.168.0.38:8080/start

//	https://github.com/spring-projects/spring-boot/issues/1239

//	https://spring.io/guides/gs/handling-form-submission/
//	https://stackoverflow.com/questions/26794334/spring-boot-mvc-template-not-loading-404-not-found
//	https://stackoverflow.com/questions/4367665/java-maven-rebuild-dependency
//	https://spring.io/guides/gs/handling-form-submission/
//	https://stackoverflow.com/questions/26794334/spring-boot-mvc-template-not-loading-404-not-found

//@RestController
@Controller
public class HelloController {


	//	https://stackoverflow.com/questions/39077787/difference-between-the-annotations-getmapping-and-requestmappingmethod-requ	
	
	@RequestMapping("/")
	public String index() {
		
		
		//applicationContext.close();
		
		return "Hello from first application Hello Hello";
	}
	

	@RequestMapping("/hello")
	public String hello(Model model) {
		
		
		
		//applicationContext.close();
		
		return "hello";
	}	
}
