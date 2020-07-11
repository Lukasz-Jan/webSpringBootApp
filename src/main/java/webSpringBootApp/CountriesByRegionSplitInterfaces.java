package webSpringBootApp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import webSpringBootApp.dataBase.Countries;
import webSpringBootApp.dataBase.interfaces.RegionRepository;
import webSpringBootApp.dataBase.interfaces.RegionRepositoryCustom;

//@Service
public class CountriesByRegionSplitInterfaces {

	public static final Logger log = LoggerFactory.getLogger(CountriesByRegionSplitInterfaces.class);
	
	@Bean // Countries in Region is OneToMany
	public CommandLineRunner countriesByRegion(RegionRepository regionRepo, RegionRepositoryCustom repoCustom) {

		return (args) -> {
			regionRepo.findAll().forEach(r -> {

				log.info("Countries in region,  countries are extracted by region but from instance of RegionRepositoryCustomImp:");
				log.info("This is one to many lazy by RegionRepositoryCustomImp");
				
				
				log.info("Countries in region " + r.getRegionName() + ":");
				List<Countries> list = repoCustom.findCountriesByRegion(r);
				for (Countries c : list) {

					log.info("             " + c.getCountryName());
				}
			});
		};

	}
	// https://stackoverflow.com/questions/36583185/spring-data-jpa-could-not-initialize-proxy-no-session-with-methods-marke
}
