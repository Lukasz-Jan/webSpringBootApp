package webSpringBootApp.dataBase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import webSpringBootApp.dataBase.interfaces.RegionRepositoryCustom;
import webSpringBootApp.dataBase.Regions;


@Service
@Transactional
@EnableTransactionManagement
public class RegionRepositoryCustomImpl implements RegionRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public List<Countries> getCountriesByRegionId(Integer reg) {

		System.out.println("getCountriesByRegion CUSTOM");
		// EntityManager entityManager = this.emf.createEntityManager();

		if (entityManager != null) {

			List<Countries> countries = entityManager.createQuery(
			        "select co " +
			                "from Countries co " +
			                "where co.region.id = :regionId",
			        Countries.class)
			        .setParameter("regionId", reg)
			        .getResultList();

			return countries;
		} else {
			System.out.println("entityManager not open");

			if (entityManager == null)
				System.out.println("Entity manager is null");
			return null;
		}

		// return null;
	}

	
	
	@Transactional
	public List<Countries> findCountriesByRegion(Regions reg) {

		System.out.println("getCountriesByRegion CUSTOM");
		// EntityManager entityManager = this.emf.createEntityManager();

		if (entityManager != null) {

			List<Countries> countries = entityManager.createQuery(
			        "select co " +
			                "from Countries co " +
			                "where co.region.id = :regionId",
			        Countries.class)
			        .setParameter("regionId", reg.getRegionId())
			        .getResultList();

			return countries;
		} else {
			System.out.println("entityManager not open");

			if (entityManager == null)
				System.out.println("Entity manager is null");

			Object ob = new Object();
			// ob.

			return null;
		}

		// return null;
	}

}
