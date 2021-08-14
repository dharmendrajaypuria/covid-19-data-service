package com.covid.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatewiseTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String testingDate;
	private String state;
	private int totalSamples;
	private int negative;
	private int positive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTestingDate() {
		return testingDate;
	}
	public void setTestingDate(String testingDate) {
		this.testingDate = testingDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getTotalSamples() {
		return totalSamples;
	}
	public void setTotalSamples(int totalSamples) {
		this.totalSamples = totalSamples;
	}
	public int getNegative() {
		return negative;
	}
	public void setNegative(int negative) {
		this.negative = negative;
	}
	public int getPositive() {
		return positive;
	}
	public void setPositive(int positive) {
		this.positive = positive;
	}
	
	
	
}
