package com.example.demo;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        Customer.of("Alex", "Hugo", 29, LocalDateTime.of(1989, 5, 25, 10, 12, 0)),
        Customer.of("Debra", "Prado",25, LocalDateTime.of(1993, 3, 15, 22, 30, 0)),
        Customer.of("Eva", "Daniels",35, LocalDateTime.of(1983, 2, 24, 5, 25, 0)),
        Customer.of("John", "Snow",28, LocalDateTime.of(1990, 3, 15, 22, 30, 0)),
        Customer.of("Jack", "Russel",33, LocalDateTime.of(1985, 3, 15, 22, 30, 0)),
        Customer.of("Michel", "Jordan",41, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Alexa", "Brown",23, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Mary", "Fishbowl",27, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Barbara", "Streisand",25, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("George", "Bush",29, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Chad", "Hullo",30, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Evan", "McGregor",31, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Christopher", "Spice",34, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Cristy", "Gates",28, LocalDateTime.of(1997, 3, 15, 22, 30, 0)),
        Customer.of("Gail", "Andersen",31, LocalDateTime.of(1997, 3, 15, 22, 30, 0))
    );

    repository.save(customers);
  }
}
