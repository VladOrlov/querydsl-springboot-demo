package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(path = "customer")
public class CustomerController {

  @Autowired
  private CustomerRepository customerRepository;

  @GetMapping()
  public ResponseEntity<Customer> getAllCustomers(Pageable page){

  }
}
