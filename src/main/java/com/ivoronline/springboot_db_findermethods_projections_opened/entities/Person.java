package com.ivoronline.springboot_db_findermethods_projections_opened.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public String  lastName;
  public Integer age;

  public Person() {}
  public Person(String name, String lastName, Integer age) {
    this.name     = name;
    this.lastName = lastName;
    this.age      = age;
  }

}
