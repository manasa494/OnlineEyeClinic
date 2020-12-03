package com.cg.onlineeyeclinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Tests {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer testId;
	private String testName;
	private String testType;
	private String testDescription;
	private Double testCost;
	
	public Tests() {
		
	}

	public Tests(String testName, String testType, String testDescription, Double testCost) {
		super();
		this.testName = testName;
		this.testType = testType;
		this.testDescription = testDescription;
		this.testCost = testCost;
	}

	public int getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestDescription() {
		return testDescription;
	}
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	public double getTestCost() {
		return testCost;
	}
	public void setTestCost(Double testCost) {
		this.testCost = testCost;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", testType=" + testType + ", testDescription="
				+ testDescription + ", testCost=" + testCost + "]";
	}
	
	
}
