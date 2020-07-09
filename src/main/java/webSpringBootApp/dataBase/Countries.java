package webSpringBootApp.dataBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import webSpringBootApp.dataBase.Regions;


@Table(name="COUNTRIES")
@Entity 

public class Countries {

	protected Countries() {};
	
	public Countries(String countryId, String countryName, Regions region) {
		
		this.countryId = countryId;
		this.countryName = countryName;
		this.region =region; 
	}
	
	@Id
	@Column(name="country_id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	// auto generation is when we not give new countryId when creating new instances
	private String countryId;
	
	@Column(name="country_name")
	private String countryName;
	
	//@Column(name="region_id")
	//private int regionId;
	

	@ManyToOne
	@JoinColumn(name = "region_id")
	private Regions region;
	
	
	public String getCountryId() {
		return countryId;
	}


	public String getCountryName() {
		return countryName;
	}

//		public Integer getRegionId() {		return regionId;		}

	public Regions getRegion() {
		return region;
	}
	
	
}
