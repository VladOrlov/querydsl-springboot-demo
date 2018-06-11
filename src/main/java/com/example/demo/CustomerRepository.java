package com.example.demo;

import com.querydsl.core.types.dsl.SimpleExpression;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

public interface CustomerRepository extends JpaRepository<Customer, Long>,
    QueryDslPredicateExecutor<Customer>, QuerydslBinderCustomizer<QCustomer> {

  @Override
  default void customize(QuerydslBindings bindings, QCustomer root) {
    bindings.bind(String.class)
        .first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);

//    bindings.bind(root.name).as("name").all((path, value) -> );
//    bindings.bind(root.lastName).as("lastName").all(SimpleExpression::in);
  }
}
