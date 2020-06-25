package webSpringBootApp.data.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pagesPackage.database.Countries;

public interface CountriesRepository extends CrudRepository<Countries, String> {

	List<Countries> findByCountryId(String countryId);
}
