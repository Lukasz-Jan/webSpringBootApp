package webSpringBootApp.dataBase.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import webSpringBootApp.dataBase.Countries;

public interface CountriesRepository extends CrudRepository<Countries, String> {

	//public List<Countries> getCountryById(String countryId);
	
}
