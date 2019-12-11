package com.rms.services;

import com.rms.entities.Feedback;

public interface FeedbackService {
	public Iterable<Feedback> getAllFeedback();
	public Feedback addFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public void deleteFeedback(Integer id);
}
