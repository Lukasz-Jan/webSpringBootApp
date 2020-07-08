package webSpringBootApp;

import webSpringBootApp.data.interfaces.StudentProducer;
import webSpringBootApp.dataBase.interfaces.AgreementRepo;
import webSpringBootApp.data.Student;
import webSpringBootApp.dataBase.Countries;
import webSpringBootApp.dataBase.interfaces.CountriesRepository;
import webSpringBootApp.dataBase.interfaces.RegionRepository;
import webSpringBootApp.dataBase.interfaces.RegionRepositoryCustom;
import webSpringBootApp.dataBase.Regions;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

//	http://localhost:8080/hello
//	http://192.168.0.38:8080/start

//	https://github.com/spring-projects/spring-boot/issues/1239

//	https://spring.io/guides/gs/handling-form-submission/
//	https://stackoverflow.com/questions/26794334/spring-boot-mvc-template-not-loading-404-not-found
//	https://stackoverflow.com/questions/4367665/java-maven-rebuild-dependency
//	https://spring.io/guides/gs/handling-form-submission/
//	https://stackoverflow.com/questions/26794334/spring-boot-mvc-template-not-loading-404-not-found

//	https://stackoverflow.com/questions/46060830/cannot-display-the-index-html-page-in-spring-boot
//	https://mkyong.com/spring-boot/spring-boot-slf4j-logging-example/

//	spring-boot:run

//@RestController
@Controller
@EnableTransactionManagement
@Transactional
public class HelloController {

	@Autowired
	private StudentProducer stProd;

	//@Autowired
	//RegionRepositoryCustom regRepCustom;

	// https://stackoverflow.com/questions/1962525/persistence-unit-as-resource-local-or-jta
	//@PersistenceContext
	//private EntityManager entityManager;



	public static final Logger log = LoggerFactory.getLogger(HelloController.class);

	// https://stackoverflow.com/questions/39077787/difference-between-the-annotations-getmapping-and-requestmappingmethod-requ

	// The preceding example explicitly specifies POST and GET for the two
	// endpoints. By default, @RequestMapping maps all HTTP operations.

	@RequestMapping("/")
	public String index() {

		// applicationContext.close();

		return "Hello from first application Hello Hello";
	}

	@RequestMapping("/hello")
	public String hello(Model model) {

		// StudentProducer stProd = new StudentProducer_Impl();

		List<Student> list = stProd.produceStudents();

		log.info(list.get(0).getAddresslist().get(0).getAddress());

		model.addAttribute("studentList_1", list);

		return "hello";
	}

	@Bean // void CommandLineRunner::run(args)
	public CommandLineRunner demoCountries(CountriesRepository repoCountries, RegionRepository regionRepo) {
		
		
		
		Optional<Regions> regOpt = regionRepo.findById(1);
		Regions reg = regOpt.get();
		log.info(reg.getRegionName());
		Countries polska = new Countries("PL", "Polska",  regOpt.get());
		log.info("POLSKA");
		Countries polska1 = repoCountries.save(polska);
		log.info(polska1.getCountryId());
		log.info("POLSKA saved");
		
		return (args) -> {
			repoCountries.findAll().forEach(c -> log
			        .info(c.getCountryName() + "                       from region " + c.getRegion().getRegionName()));
		};
	}

	@Bean // Countries in Region is OneToMany
	public CommandLineRunner countriesByRegion(RegionRepository regionRepo, RegionRepositoryCustom repoCustom) {

		return (args) -> {
			regionRepo.findAll().forEach(r -> {

				
				log.info("Countries in region " + r.getRegionName() + ":");
				// r.getCountries().size();


				//List<Countries> list = regRepCustom.getCountriesByRegion(r);
				//regionRepo.
				log.info("LOG 1 ");
				List<Countries> list = repoCustom.findCountriesByRegion(r);
				//regionRepo.
				log.info("LOG 2 ");
				if (list != null) {
					log.info("list.size() " + list.size());

					// writeCountriesInRegion(r);

					for (Countries c : list) {
						// Hibernate.initialize(c);
						log.info("             " + c.getCountryName());
					}
				}

			});
		};

	}
	// https://stackoverflow.com/questions/36583185/spring-data-jpa-could-not-initialize-proxy-no-session-with-methods-marke



	@Bean
	public CommandLineRunner demoSa(AgreementRepo saAgrRepo) {

		return (args) -> {

			saAgrRepo.findAll().forEach(sa -> log.info("sa id: " + sa.getSaId().toString()));
		};

		// args -> { saAgrRepo.

	}

	// https://stackoverflow.com/questions/25063995/spring-boot-handle-to-hibernate-sessionfactory

	// https://stackoverflow.com/questions/41480857/persistencecontext-not-injecting-entitymanager
	// https://stackoverflow.com/questions/1962525/persistence-unit-as-resource-local-or-jta

}