package webSpringBootApp.dataBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="CL_SA")
@Entity
public class ServiceAgreement {

	
	protected ServiceAgreement() {}; 
	
	@Id
	@Column(name="sa_id")
	private Integer saId;

	
	@Column(name="sa_type")
	private String saType;
	
	@Column(name="account_Id")
	private String accoutId;
	
	@Column(name="sa_relation")
	private String saRelation;

	public Integer getSaId() {
		return saId;
	}

	public String getSaType() {
		return saType;
	}

	public String getAccoutId() {
		return accoutId;
	}

	public String getSaRelation() {
		return saRelation;
	}	
	
}