package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.FeedbackRepository;
import com.rms.entities.Feedback;
import com.rms.services.FeedbackService;
@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	FeedbackRepository feedbackRepository;
	@Override
	public Iterable<Feedback> getAllFeedback() {
		// TODO Auto-generated method stub
		return feedbackRepository.findAll();
	}

	@Transactional
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackRepository.save(feedback);
	}

	@Transactional
	public Feedback updateFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackRepository.save(feedback);
	}

	@Transactional
	public void deleteFeedback(Integer id) {
		feedbackRepository.deleteById(id);
	}

}
