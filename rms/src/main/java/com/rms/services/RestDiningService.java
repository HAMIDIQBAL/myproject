package com.rms.services;

import com.rms.entities.RestDining;

public interface RestDiningService {
	public Iterable<RestDining> getAllRestDining();
	public RestDining addRestDining(RestDining restDining);
	public RestDining updateRestDining(RestDining restDining);
	public void deleteRestDining(int id);
}
