package com.cg.onlineeyeclinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyeclinic.exception.TestIdNotFoundException;
import com.cg.onlineeyeclinic.model.Tests;
import com.cg.onlineeyeclinic.repository.ITestRepository;

@Service("name= TestService")
@Transactional
public class TestServiceImpl implements ITestService {
	

	@Autowired
	ITestRepository repository;

	@Override
	public Tests addTest(Tests tests) {
		tests =  repository.save(tests);
		return tests;
	}

	@Override
	public Tests updateTest(Tests tests) {
		tests =  repository.save(tests);
		return tests;
	}

	public void deleteById(int testId) {
		repository.deleteById(testId);
	}

	@Override
	public Tests deleteTest(int testId) throws TestIdNotFoundException{
		<Optional<Tests> tes=repository.findById(id);
		if(tes==null)
			throw new TestIdNotFoundException("test id not found");
		else {
		 repository.deleteById(testId);
		return null;
	}
	
	@Override
	public Optional<Tests> viewTest(int testId) throws TestIdNotFoundException {
		Optional<Tests> tes = repository.findById(testId);
		if(tes==null)
			throw new TestIdNotFoundException("test id not found");
		return tes;

	}

	@Override
	public List<Tests> viewTestsList() {
		List<Tests> allTests= repository.viewTestsList();
		return allTests;
		}
//	@Override
//	public List<Test> viewTests() {
//		List<Test> allTests = repository.viewTests();
//		return allTests;
//	}
//
//	@Override
//	public Tests createTest(Tests tests) {
//		
//		return null;
//	}

	@Override
	public Tests createTest(Tests test) {
    // TODO Auto-generated method stub
		return null;
	}

	
}