package com.rms.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.entities.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
