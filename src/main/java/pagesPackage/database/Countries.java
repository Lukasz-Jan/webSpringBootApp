package pagesPackage.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name ="countries")
@Table(name = "Countries")		//	prawdziwa nazwa tabeli
public class Countries {

	protected Countries() {}
	
	public String getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String countryId;
	
	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "region_id")
	private int regionId; 
}
