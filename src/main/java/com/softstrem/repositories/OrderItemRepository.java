package com.softstrem.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.softstrem.entities.OrderItem;
import com.softstrem.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
