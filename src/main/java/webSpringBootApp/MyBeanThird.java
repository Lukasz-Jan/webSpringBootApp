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
		System.out.println("MyBeanThird::init");
		logger.info("MyBeanThird::init");
		logger.debug("MyBeanThird::init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("MyBeanThird @PreDestroy");
	}

	public void doSomething() {

		System.out.println("MyBeanThird doSomething()");
	}
}
