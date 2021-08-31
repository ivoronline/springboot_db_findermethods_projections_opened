package com.ivoronline.springboot_db_findermethods_projections_opened.repositories;
import com.ivoronline.springboot_db_findermethods_projections_opened.entities.Person;
import com.ivoronline.springboot_db_findermethods_projections_opened.entities.PersonView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  PersonView findViewByName(String name);
}

