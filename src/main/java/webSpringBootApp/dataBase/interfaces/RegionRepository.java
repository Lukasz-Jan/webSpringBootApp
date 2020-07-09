package webSpringBootApp.dataBase.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import webSpringBootApp.dataBase.Countries;
import webSpringBootApp.dataBase.Regions;

@Transactional(readOnly = true)


public interface RegionRepository extends CrudRepository<Regions, Integer>{

	//@Query("SELECT NEW webSpringBootApp.dataBase.Countries(co.getCountryId(), co.getCountryName(). co.getRegion()) FROM Countries co where co.region = ?1")
	//public List<Countries> findCountriesByRegionT(Regions reg);

}
