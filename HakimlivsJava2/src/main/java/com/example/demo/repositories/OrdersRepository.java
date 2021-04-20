package com.example.demo.repositories;

import com.example.demo.models.Customer;
import com.example.demo.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
}
