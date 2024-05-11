package com.tnsif.Shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.Shopping.entity.Order;

public interface OrderRepository extends  JpaRepository<Order, Integer>{

}
