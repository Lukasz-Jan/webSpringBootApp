package webSpringBootApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/*
@Component
@Component is the most generic Spring annotation. A Java class decorated with @Component is found during classpath scanning and registered in the context as a Spring bean. @Service, @Repository, and @Controller are specializations of @Component, which are used for more specific cases.

@ComponentScan ensures that the classes decorated with @Component are found and registered as Spring beans. @ComponentScan is automatically included with @SpringBootApplication.

@Bean servers a similar purpose as @Component. It is not autodetected. Methods decorated with @Bean produce a bean to be managed by the Spring container during configuration stage.
*/

@Component
public class MyBeanSecond {

	 @PostConstruct
	   public void init() {
		 System.out.println("MyBeanSecond::init");
	 }
	
	 @PreDestroy
   public void destroy() {
       System.out.println("MyBeanSecond @PreDestroy");
   }
	 
	 
	 public void doSomething() {
		 
		 System.out.println("MyBeanSecond doSomething()");
	 }
	
}
