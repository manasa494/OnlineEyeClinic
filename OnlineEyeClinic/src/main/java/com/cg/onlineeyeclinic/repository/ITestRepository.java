package com.cg.onlineeyeclinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.onlineeyeclinic.model.Tests;

@Repository
public interface ITestRepository extends JpaRepository<Tests, Integer> {
	
	@Query("select tes from Tests tes")
	List<Tests> viewTestsList();
	
	@Query("select a from Test a")
	List viewAppointments();

}

