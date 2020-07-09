package webSpringBootApp.dataBase.interfaces;

import org.springframework.data.repository.CrudRepository;

import webSpringBootApp.dataBase.Regions;

public interface TestRepo extends CrudRepository<Regions, Integer>, TestRepoExt {

}
