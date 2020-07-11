package webSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import webSpringBootApp.dataBase.Regions;
import webSpringBootApp.dataBase.interfaces.TestRepo;

@Service
public class ByQueryInExtInterface {

	public static final Logger log = LoggerFactory.getLogger(ByQueryInExtInterface.class);

	/*
	 * Handles query of getting coutries by region id Query is made in
	 * TestRepoExt interface in Query anntotatiopn Query IS NOT made in
	 * TestRepoExtImpl !!! - interesting
	 */

	@Bean
	public CommandLineRunner testBean(TestRepo testR) {

		
		
		//	CrudRepository<Regions, Integer>::findAll() 
		
		return (args) -> {

			log.info("TEST BEAN");
			System.out.println("TEST BEAN");
			testR.findAll().forEach(

			        reg -> {

			        	// TestRepoExt::findCountriesByRegionId
				        testR.findCountriesByRegionId(reg.getRegionId()).forEach(c -> log.info(c.getCountryName()));
			        });

		};

	}

}
