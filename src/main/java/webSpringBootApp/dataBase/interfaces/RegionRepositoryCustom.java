 package webSpringBootApp.dataBase.interfaces;

import java.util.List;

import webSpringBootApp.dataBase.Countries;
import webSpringBootApp.dataBase.Regions;

public interface RegionRepositoryCustom {

	public List<Countries> findCountriesByRegion(Regions reg);
}
