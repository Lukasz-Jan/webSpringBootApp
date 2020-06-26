package pagesPackage.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//	https://www.baeldung.com/jpa-entities
//https://www.baeldung.com/jpa-entities

//	If we do not use the @Table annotation, the name of the entity will be considered the name of the table.
@Entity
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String countryId;
	
	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "region_id")
	private int regionId; 
}
