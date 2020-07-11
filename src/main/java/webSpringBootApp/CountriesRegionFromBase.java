package webSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import webSpringBootApp.dataBase.interfaces.CountriesRepository;
import webSpringBootApp.dataBase.interfaces.RegionRepository;

@Service
public class CountriesRegionFromBase {

	public static final Logger log = LoggerFactory.getLogger(CountriesRegionFromBase.class);
	
	@Bean // void CommandLineRunner::run(args)
	public CommandLineRunner demoCountries(CountriesRepository repoCountries) {

		// Optional<Regions> regOpt = regionRepo.findById(1);
		// Countries polska = new Countries("PL", "Polska", regOpt.get());
		// repoCountries.save(polska);

		log.info("CountriesRegionFromBase ");
		
		
		
		return (args) -> {
			
			
			log.info("CountriesRegionFromBase::demoCountries:	\n");
			log.info("One interface expanded for getting Coutries and regions ");
			log.info("It is Many To One getting region by country ");
			repoCountries.findAll().forEach(c -> log.info(c.getCountryName() + "                  from region " + c.getRegion().getRegionName()));
		};
	}
	

}
