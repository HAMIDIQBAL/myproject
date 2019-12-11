package com.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.rms.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
