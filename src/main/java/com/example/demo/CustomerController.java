package com.example.demo;

import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {

  private final CustomerRepository customerRepository;

  @Autowired
  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping()
  public ResponseEntity<Page<Customer>> getAllCustomers(Pageable page, @QuerydslPredicate(root = Customer.class) Predicate predicate) {
    Page<Customer> customers = customerRepository.findAll(predicate, page);
    return ResponseEntity.ok(customers);
  }
}
