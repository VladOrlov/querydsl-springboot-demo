package com.example.demo;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String lastName;


  public static Customer of(String name, String lastName){
    Customer customer = new Customer();
    customer.setName(name);
    customer.setLastName(lastName);
    return customer;
  }
}
