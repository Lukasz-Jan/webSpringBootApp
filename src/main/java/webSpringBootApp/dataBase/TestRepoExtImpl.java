package webSpringBootApp.dataBase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import webSpringBootApp.dataBase.interfaces.TestRepoExt;



public class TestRepoExtImpl implements TestRepoExt {

	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Countries> findCountriesByRegionId(Integer regId) {

		System.out.println("\nHELLO HELLO HELLO HELLO\n");
		if (entityManager != null) { // createQuery is for JPQL queries
			List<Countries> countries = entityManager.createQuery(
			        "select co from Countries co where co.region.id = :regionId", Countries.class)
			        .setParameter("regionId", regId)
			        // "select new Countries(co.getCountryId(),
			        // co.getCountryName(), co.getRegion()) from Countries co
			        // where co.region.id = :regionId",
			        // Countries.class).setParameter("regionId", regId)
			        .getResultList();
			return countries;
		}
		return null;
	}
}
