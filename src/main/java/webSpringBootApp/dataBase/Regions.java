package webSpringBootApp.dataBase;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import webSpringBootApp.dataBase.Countries;


@Table(name="Regions")
@Entity

public class Regions {

	protected Regions() {}

	
	@Id
	@Column(name = "region_id")
	private Integer regionId;
	
	@Column(name = "region_name")
	private String regionName;
	
	//	https://stackoverflow.com/questions/22821695/how-to-fix-hibernate-lazyinitializationexception-failed-to-lazily-initialize-a
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id")
	List<Countries> countries;


	public Integer getRegionId() {
		return regionId;
	}


	public String getRegionName() {
		return regionName;
	}


	public List<Countries> getCountries() {

		

		//Session session = entityManager.unwrap(Session.class);
		
		//Session session = HibernateUtil.getSessionFactory().openSession();
		 //EntityManager em = session.getEntityManagerFactory().createEntityManager();
		
		/*
		List<Countries> countries = entityManager.createQuery(
			    "select co.countryName " +
			    "from Countries co " +
			    "where co.regionId.id = :regionId", Countries.class)
			.setParameter( "regionId", this.getRegionId() )
			.getResultList();
		
		session.close();
		*/
		return countries;
	}


	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}
	
	public String toString() {
		
		return getRegionName();
	}
}
