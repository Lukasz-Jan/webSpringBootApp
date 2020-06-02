package webSpringBootApp;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//	http://localhost:8080/close()

@RestController
public class CloseController {

	@Autowired
	private ApplicationContext context;
	
	@RequestMapping("/close")
	public void close() {
		
		 int exitCode = SpringApplication.exit(context,  () -> 0);
		    System.exit(exitCode);		
	}
	
	
	  @PreDestroy
      public void destroy() {
		  
		  //CloseController
          System.out.println("CloseController::preDestroy");
      }
}
