package com.example.demo.repositories;

import com.example.demo.models.OrderInfo;
import com.example.demo.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderInfoRepository extends CrudRepository<OrderInfo, Long> {
}
