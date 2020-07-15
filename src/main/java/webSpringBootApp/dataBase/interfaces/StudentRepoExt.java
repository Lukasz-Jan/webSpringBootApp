package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import webSpringBootApp.entities.Students;


//	@NoRepositoryBean	- nie zostanie bean znaleziony w klasie UpdateStudentRunner
public interface StudentRepoExt extends StudentRepo {
	
	@Query("select st.name from Students st where st.name = :name")
	public String getStudentByName(@Param("name") String name); 
}
