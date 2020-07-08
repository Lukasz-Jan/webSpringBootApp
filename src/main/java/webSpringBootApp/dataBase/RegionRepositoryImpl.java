package webSpringBootApp.dataBase;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import webSpringBootApp.dataBase.interfaces.RegionRepository;
import webSpringBootApp.dataBase.interfaces.RegionRepositoryCustom;
import webSpringBootApp.dataBase.Regions;

public class RegionRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;	
	
	//@Autowired 
	//RegionRepository regionRep;
	


	
	
	@Transactional
	public List<Countries> findCountriesByRegionId(Integer reg) {

		
		
		System.out.println("getCountriesByRegion CUSTOM");
	//	EntityManager entityManager = this.emf.createEntityManager();
		
		if (entityManager != null) {

			Countries polska = new Countries();
			
			List<Countries> countries = entityManager.createQuery(
			        "select co from Countries co where co.region.id = :regionId",
			        Countries .class)
			        .setParameter("regionId", reg)
			        .getResultList();

			return countries;
		}
		else {
			System.out.println("entityManager not open");
			
			if(entityManager == null) System.out.println("Entity manager is null");
			
			return null;
		}
		
		//return null;
	}	
	

	

}
