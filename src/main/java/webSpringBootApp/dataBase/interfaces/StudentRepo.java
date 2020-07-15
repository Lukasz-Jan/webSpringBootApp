package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.repository.CrudRepository;

import webSpringBootApp.entities.Students;


public interface StudentRepo extends CrudRepository<Students, Integer> {

}
