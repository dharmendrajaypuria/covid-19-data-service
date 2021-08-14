package com.covid.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.covid.data.dto.CovidDataResponse;
import com.covid.data.entity.CovidCases;
import com.covid.data.entity.StatewiseTest;
import com.covid.data.entity.VaccineStatus;
import com.covid.data.repository.CovidCasesRepository;
import com.covid.data.repository.StatewiseTestingRepository;
import com.covid.data.repository.VaccineStatusRepository;

@Service
public class CovidDataService {

	@Autowired
	CovidCasesRepository covidCasesRepository;
	
	@Autowired
	VaccineStatusRepository vaccineStatusRepository;
	
	@Autowired
	StatewiseTestingRepository statewiseTestingRepository;
	
	
	public ResponseEntity<CovidDataResponse> getDateInfo(String date){
		
		CovidDataResponse response = new CovidDataResponse();
		
		try {
			
			List<CovidCases> covidCaseList = covidCasesRepository.findByConfirmDate(date);
			response.setCovidCaseList(covidCaseList);
			
			List<VaccineStatus> vaccinationList = vaccineStatusRepository.findByVaccineDate(date);
			response.setVaccinationList(vaccinationList);
			
			List<StatewiseTest> testList = statewiseTestingRepository.findByTestingDate(date);
			response.setTestList(testList);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}


	public ResponseEntity<CovidDataResponse> getStateInfo(String state) {
		

		CovidDataResponse response = new CovidDataResponse();
		
		try {
			
			List<CovidCases> covidCaseList = covidCasesRepository.findByState(state);
			response.setCovidCaseList(covidCaseList);
			
			List<VaccineStatus> vaccinationList = vaccineStatusRepository.findByState(state);
			response.setVaccinationList(vaccinationList);
			
			List<StatewiseTest> testList = statewiseTestingRepository.findByState(state);
			response.setTestList(testList);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}


	public ResponseEntity<CovidDataResponse> getPinpointStateInfo(String state, String date) {
		
		CovidDataResponse response = new CovidDataResponse();
		
		try {
			
			List<CovidCases> covidCaseList = covidCasesRepository.findByStateAndDate(state, date);
			response.setCovidCaseList(covidCaseList);
			
			List<VaccineStatus> vaccinationList = vaccineStatusRepository.findByStateAndDate(state, date);
			response.setVaccinationList(vaccinationList);
			
			List<StatewiseTest> testList = statewiseTestingRepository.findByStateAndDate(state, date);
			response.setTestList(testList);
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
