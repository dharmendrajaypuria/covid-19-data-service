package com.covid.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covid.data.dto.CovidDataResponse;
import com.covid.data.service.CovidDataService;

@RestController("/")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CovidDataController {

	
	@Autowired
	CovidDataService covidDataService;
	
	@GetMapping("/get_date_info")
	public ResponseEntity<CovidDataResponse> getAllInfo(@RequestParam("date") String date){
		return covidDataService.getDateInfo(date);
	}
	
	@GetMapping("/get_state_info")
	public ResponseEntity<CovidDataResponse> getStateInfo(@RequestParam("state") String state){
		return covidDataService.getStateInfo(state);
	}
	
	@GetMapping("/pinpoint_state")
	public ResponseEntity<CovidDataResponse> getPinpointStateInfo(@RequestParam("state") String state, @RequestParam("date") String date){
		return covidDataService.getPinpointStateInfo(state, date);
	}
	
}
