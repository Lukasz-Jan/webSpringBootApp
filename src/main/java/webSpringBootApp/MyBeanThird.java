package webSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;


public class MyBeanThird {

	
	private static final Logger logger = LoggerFactory.getLogger(MyBeanThird.class);
	
	@PostConstruct
	public void init() {
		
		//	https://stackoverflow.com/questions/8716259/what-does-the-apr-based-apache-tomcat-native-library-was-not-found-mean
		System.out.println("\nMyBeanThird::init");
		logger.info("MyBeanThird::init info");
		logger.debug("MyBeanThird::init debug");
		logger.warn("MyBeanThird::init warn");
		logger.error("MyBeanThird::init error");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("MyBeanThird @PreDestroy");
	}

	public void doSomething() {

		System.out.println("MyBeanThird doSomething()");
		logger.info("MyBeanThird::doSomething() info");
		logger.warn("MyBeanThird::doSomething() warn");
		logger.debug("MyBeanThird::doSomething() debug");
		logger.error("MyBeanThird::doSomething() error");
	}
}
