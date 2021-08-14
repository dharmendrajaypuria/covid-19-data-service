package com.covid.data.dto;

import java.util.List;

import com.covid.data.entity.CovidCases;
import com.covid.data.entity.StatewiseTest;
import com.covid.data.entity.VaccineStatus;

public class CovidDataResponse {

	private List<CovidCases> covidCaseList;
	private List<StatewiseTest> testList;
	private List<VaccineStatus> vaccinationList;
	
	
	public List<CovidCases> getCovidCaseList() {
		return covidCaseList;
	}
	public void setCovidCaseList(List<CovidCases> covidCaseList) {
		this.covidCaseList = covidCaseList;
	}
	public List<StatewiseTest> getTestList() {
		return testList;
	}
	public void setTestList(List<StatewiseTest> testList) {
		this.testList = testList;
	}
	public List<VaccineStatus> getVaccinationList() {
		return vaccinationList;
	}
	public void setVaccinationList(List<VaccineStatus> vaccinationList) {
		this.vaccinationList = vaccinationList;
	}
	
	
	
}
