package com.cg.onlineeyeclinic.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlineeyeclinic.exception.TestIdNotFoundException;
import com.cg.onlineeyeclinic.model.Tests;

	public interface ITestService {
		Tests addTest(Tests tests);
		Tests updateTest(Tests tests);
		Tests deleteTest(int testId) throws TestIdNotFoundException;
		Optional<Tests> viewTest(int testId)throws TestIdNotFoundException;
		
		List<Tests> viewTestsList();
//		List<Appointment> viewAppointments();
		Tests createTest(Tests test);
	}

