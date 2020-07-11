package webSpringBootApp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import webSpringBootApp.dataBase.Countries;
import webSpringBootApp.dataBase.interfaces.CountriesRepository;
import webSpringBootApp.dataBase.interfaces.CountriesRepositoryOne;

@Controller
public class HelloCountries {

	@Autowired
	CountriesRepositoryOne countryRepoOne;	
	
	public static final Logger log = LoggerFactory.getLogger(HelloCountries.class);	
	
	@RequestMapping("/helloCountries")
	public String helloCountries(Model model, CountriesRepository repoCountries) {

		//	http://localhost:8080/helloCountries
		// https://stackoverflow.com/questions/36713663/how-to-fix-the-crudrepository-savejava-lang-object-is-no-accessor-method-in-sp

		Iterable<Countries> sourceIter = countryRepoOne.findAll();

		// Collectors.toList()

		List<Countries> list = StreamSupport.stream(sourceIter.spliterator(), false)
		        .sorted((arg2, arg1) -> arg1.getCountryName()
		                .compareToIgnoreCase(arg2.getCountryName()))
		        .collect(Collectors.toList());
		log.info("LIST:");
		list.stream().forEach(	c -> log.info(c.getCountryName())	);
		
		log.info("ITERABLE");
		sourceIter.forEach(    c -> log.info(c.getCountryName()));
		
		//	list is different order than sourceIter can be seen on the page and in log
		
		log.info("HelloController::helloCountries");

		
		model.addAttribute("countriesList_1", sourceIter);

		return "helloCountries";
	}	
}
