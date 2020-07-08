package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.repository.CrudRepository;

import webSpringBootApp.dataBase.ServiceAgreement;

public interface AgreementRepo extends CrudRepository<ServiceAgreement, Integer> {

	
}
