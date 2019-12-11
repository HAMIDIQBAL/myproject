package com.admin.data;
import org.springframework.data.repository.CrudRepository;

import com.admin.entities.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

}
