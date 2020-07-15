package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import webSpringBootApp.entities.Students;

@NoRepositoryBean
public interface StudentRepo extends CrudRepository<Students, Integer> {

	public void deleteById(Integer arg0);
}
