package com.security.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.entities.Permission;
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

}
