package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.repository.CrudRepository;

import webSpringBootApp.dataBase.Countries;

public interface CountriesRepositoryOne extends CrudRepository<Countries, String> {

}
