package com.ivoronline.springboot_db_findermethods_projections_opened.entities;

import org.springframework.beans.factory.annotation.Value;

//Interface can only have Methods. It can't have Properties/State.
public interface PersonProjection {

  //OPENED PROJECTION
  @Value("#{target.firstName + ' ' + target.lastName}")  //SpEL - Spring Expression Language
  String getFullName();

}



