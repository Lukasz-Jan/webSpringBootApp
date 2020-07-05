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
	private int saId;

	
	@Column(name="sa_type")
	private String saType;
	
	@Column(name="account_Id")
	private String accoutId;
	
	@Column(name="sa_relation")
	private String saRelation;	
	
}
