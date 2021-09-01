package com.ivoronline.springboot_db_findermethods_projections_opened.controllers;

import com.ivoronline.springboot_db_findermethods_projections_opened.entities.PersonView;
import com.ivoronline.springboot_db_findermethods_projections_opened.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND PERSON VIEW BY NAME
  //================================================================
  @RequestMapping("FindPersonViewByName")
  PersonView findPersonViewByName() {
    PersonView personView = personRepository.findPersonViewByName("John");
    return     personView;
  }

}
