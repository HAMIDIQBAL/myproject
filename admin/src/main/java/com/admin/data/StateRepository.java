package com.admin.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entities.State;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
	public Optional<State> findByStateId(String stId);
}
