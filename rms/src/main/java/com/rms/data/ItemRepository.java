package com.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.rms.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
