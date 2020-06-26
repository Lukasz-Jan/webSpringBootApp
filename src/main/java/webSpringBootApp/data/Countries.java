package webSpringBootApp.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="COUNTRIES")
@Entity 
public class Countries {

	protected Countries() {};
	
	@Id
	@Column(name="country_id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String countryId;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="region_id")
	private Integer regionId;
	
	
	public String getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public Integer getRegionId() {
		return regionId;
	}

	
	
}
