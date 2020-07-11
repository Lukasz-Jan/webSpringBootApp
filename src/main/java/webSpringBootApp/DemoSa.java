package webSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import webSpringBootApp.dataBase.interfaces.AgreementRepo;

//@Service
public class DemoSa {

	
	public static final Logger log = LoggerFactory.getLogger(DemoSa.class);
	
	@Bean
	public CommandLineRunner demoSaRunner(AgreementRepo saAgrRepo) {

		log.info("DEMO	 	SA      ");
		return (args) -> {

			saAgrRepo.findAll().forEach(sa -> log.info("sa id: " + sa.getSaId().toString() + " type relation: " + sa.getSaType()) );
		};
	}
}
