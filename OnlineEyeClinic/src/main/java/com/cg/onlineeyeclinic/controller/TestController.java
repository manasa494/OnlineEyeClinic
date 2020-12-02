package com.cg.onlineeyeclinic.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyeclinic.exception.TestIdNotFoundException;
import com.cg.onlineeyeclinic.model.Tests;
import com.cg.onlineeyeclinic.service.ITestService;

@RestController
@RequestMapping("/api/Test")
public class TestController {
	
	@Autowired
	ITestService service;
	
    @PostMapping("/addTest")
    public ResponseEntity<Tests> addTest(@Valid @RequestBody Tests tests){
	tests=service.addTest(tests);
	return new ResponseEntity<Tests>(tests, HttpStatus.OK);
    }

    @PutMapping("/updateTest")
    public ResponseEntity<Tests> updateTest(@Valid @RequestBody Tests tests){
	tests = service.updateTest(tests);
	return new ResponseEntity<Tests>(tests, HttpStatus.OK); 
    }

    @DeleteMapping("/deleteTestById/{id}")
	public ResponseEntity<String> deleteTestById(@PathVariable("id") Integer id) {
    	Optional<Tests> tes=service.viewTest(id);
    	
    	if(tes.isEmpty())
    	throws new TestIdNotFoundException("tests id not found:(");
		service.deleteTest(id);
		return new ResponseEntity<String>("Test Deleted Successfully", HttpStatus.OK);
	}
    @GetMapping("/viewTestById/{id}")
	public ResponseEntity<Optional<Tests>> viewTestById(@PathVariable("id") Integer id) {
		Optional<Tests> tes = service.viewTest(id);
		if(tes.isEmpty())
			throws new TestIdNotFoundException("tests id not found:(");
		return new ResponseEntity<Optional<Tests>>(tes, HttpStatus.OK);
	}
	

//	@Override
//	public List<Appointment> viewAppointments() {
//		List<Appointment> allAppointments = repository.viewAppointments();
//		return allAppointments;
//	}
//
    
 

@GetMapping("/viewTestsList")
  public ResponseEntity<List<Tests>> viewAllTests(){
  return new ResponseEntity<List<Tests>>(service.viewTestsList(), HttpStatus.OK);
 }

}


