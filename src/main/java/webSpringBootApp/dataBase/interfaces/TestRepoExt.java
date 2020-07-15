package webSpringBootApp.dataBase.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import webSpringBootApp.dataBase.Countries;
import webSpringBootApp.dataBase.Regions;


public interface TestRepoExt {

	//@Query("SELECT NEW webSpringBootApp.dataBase.Countries(co.getCountryId(), co.getCountryName(), co.getRegion()) FROM Countries co where co.region.id = :regId")
	
	//@Query(nativeQuery = true, value = "SELECT NEW webSpringBootApp.dataBase.Countries(co.getCountryId(), co.getCountryName(), co.getRegion()) FROM Countries co where co.region_id = 1")
	//@Query(nativeQuery = true, value = "SELECT co FROM Countries co where co.region_id = 1")
	
	
	//@Query("SELECT co FROM Countries co where co.region.id = 1")
	//public List<Countries> findCountriesByRegionId();
	
	@Query("SELECT co FROM Countries co where co.region.id = :regId")
	public List<Countries> findCountriesByRegionId(@Param("regId") Integer reg);
	
	      //select co from Countries co where co.region.id = :regionId
	//@Query("select co from Countries co where co.region = :reg")
	
	
	
	
	// In use with TestRepoImpl implements TestRepo and returns error
	//	No converter found capable of converting from type [webSpringBootApp.dataBase.Regions] to type [webSpringBootApp.dataBase.Countries]
	//public List<Countries> findCountriesByRegionId(Integer reg);
	
}
