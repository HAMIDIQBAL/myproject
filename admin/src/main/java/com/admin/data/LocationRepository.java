package com.admin.data;
import org.springframework.data.repository.CrudRepository;

import com.admin.entities.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
