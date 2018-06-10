package com.example.demo;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbUtils {

  private final CustomerRepository repository;

  @Autowired
  public DbUtils(CustomerRepository repository) {
    this.repository = repository;
  }

  public void fillCustomers() {

    List<Customer> customers = Lists.newArrayList(
        Customer.of("Alex", "Hugo"),
        Customer.of("Debra", "Prado"),
        Customer.of("Eva", "Daniels"),
        Customer.of("John", "Snow"),
        Customer.of("Jack", "Russel"),
        Customer.of("Michel", "Jordan"),
        Customer.of("Alexa", "Brown"),
        Customer.of("Mary", "Fishbowl"),
        Customer.of("Barbara", "Streisand"),
        Customer.of("George", "Bush"),
        Customer.of("Evan", "McGregor"),
        Customer.of("Christopher", "Spice"),
        Customer.of("Cristy", "Gates"),
        Customer.of("Gail", "Andersen")
    );

    repository.save(customers);
  }
}
