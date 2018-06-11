package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

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

  private Integer age;

  private LocalDateTime dateOfBirth;

  public static Customer of(String name, String lastName, Integer age, LocalDateTime date) {
    Customer customer = new Customer();
    customer.setName(name);
    customer.setLastName(lastName);
    customer.setAge(age);
    customer.setDateOfBirth(date);
    return customer;
  }
}
