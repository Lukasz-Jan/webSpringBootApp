package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import webSpringBootApp.entities.Students;

public interface StudentRepoExt extends StudentRepo {


	
	@Query("select st from Students st where st.name = :name")
	public Students getStudentByName(@Param("name") String name); 
}
