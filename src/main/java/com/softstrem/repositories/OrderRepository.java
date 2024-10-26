package com.softstrem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softstrem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
