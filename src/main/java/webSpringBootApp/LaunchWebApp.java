package webSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Arrays;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


//	https://spring.io/guides/gs/spring-boot/
//	https://stackoverflow.com/questions/30855864/maven-no-plugin-found-for-prefix-spring-boot-in-the-current-project-and-in-th
//	http://localhost:8080/
//	https://stackoverflow.com/questions/39193836/terminated-spring-boot-app-in-eclipse-shutdown-hook-not-called
//	https://docs.spring.io/spring-boot/docs/current/maven-plugin/run-mojo.html
//	https://spring.io/guides/gs/spring-boot/


//	starting server:
//	https://stackoverflow.com/questions/23677808/how-to-run-spring-boot-web-application-in-eclipse-itself
//	spring-boot:run

//	https://spring.io/guides/gs/handling-form-submission/

//	https://www.baeldung.com/jpa-mapping-single-entity-to-multiple-tables



@SpringBootApplication(scanBasePackages = {"pagesPackage"})
//@EnableAutoConfiguration
//@ComponentScan
//@EntityScan(basePackages = {"webSpringBootApp.data"})  // scan JPA entities
public class LaunchWebApp {

	public static void main(String[] args ) {

		ConfigurableApplicationContext ctx = SpringApplication.run(LaunchWebApp.class,  args);
		
		System.out.println("LaunchWebApp RUN");
		
		
		
		MyBean myBean = ctx.getBean(MyBean.class);
        myBean.doSomething();

        MyBeanThird myBeanThird = ctx.getBean(MyBeanThird.class);
        myBeanThird.doSomething();
        
		//ctx.close();
        //ctx.
		
		//ctx.
		
		
		/*
		System.out.println("Press 'Enter' to terminate");
	    new Scanner(System.in).nextLine();
	    System.out.println("Exiting");
	    System.exit(1);
	    */
	}
	
	
    @Bean
    public ApplicationRunner systemExitListener1() {

    	System.out.println("systemExitListener1");
    	return args -> {
            
    		if (args.getOptionValues("exitListener") != null) {
                System.out.println("Press Enter to exit application");
                new Scanner(System.in).nextLine();
                System.out.println("Exiting");
                System.exit(0);
            }
        };
   
    }
    
    //	https://stackoverflow.com/questions/21520316/the-annotation-bean-is-disallowed-for-this-location-error/21520759
    //	The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.
    @Bean
    public MyBeanThird myBeanThird() {
    	return new MyBeanThird();
    }
    
    

    @Bean
    MyBean myBean() {
        return new MyBean();
    }
    
    
    private class MyBean {

    	 @PostConstruct
    	   public void init() {
    		 System.out.println("MyBean::init");
    	 }
    	
    	 @PreDestroy
         public void destroy() {
             System.out.println("MyBean @PreDestroy");
         }
    	 
    	 
    	 public void doSomething() {
    		 
    		 System.out.println("MyBean::doSomething()");
    	 }
    }
    	
    
    
    
	
			// CommandLineRunner::run(String... args) : void
    @Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
		System.out.println("commandLineRunner");
		
		
		return args -> {

			for(String arg: args) {
				
				System.out.println("arg: " + arg);
			}
			
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			
			String[] beanNames = ctx.getBeanDefinitionNames();
			
			Arrays.sort(beanNames);
			
			System.out.println("beanNames.length: " + beanNames.length);
			/*
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
			*/
			

		};
	}
}