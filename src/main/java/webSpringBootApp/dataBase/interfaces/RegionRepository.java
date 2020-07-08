package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import webSpringBootApp.dataBase.Regions;

@Transactional(readOnly = true)


public interface RegionRepository extends CrudRepository<Regions, Integer>{

	 

}
