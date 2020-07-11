package webSpringBootApp.dataBase.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import webSpringBootApp.dataBase.Countries;

@Repository
public interface CountriesRepository extends CrudRepository<Countries, String> {

	//public List<Countries> getCountryById(String countryId);
	
}
