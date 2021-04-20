package com.example.demo.repositories;

import com.example.demo.models.Customer;
import com.example.demo.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
