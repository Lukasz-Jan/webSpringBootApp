package webSpringBootApp;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

//	http://localhost:8080/start
//	http://192.168.0.38:8080/start

//	https://github.com/spring-projects/spring-boot/issues/1239

@RestController
public class HelloController {


	
	@RequestMapping("/start")
	public String index() {
		
		
		//applicationContext.close();
		
		return "Hello from first application Hello Hello";
	}
}
