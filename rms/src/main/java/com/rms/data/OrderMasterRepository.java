package com.rms.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.entities.OrderMaster;
@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster, Integer> {

}
