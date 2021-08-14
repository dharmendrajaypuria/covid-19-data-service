package com.covid.data.config;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.covid.data.entity.CovidCases;
import com.covid.data.entity.StatewiseTest;
import com.covid.data.entity.VaccineStatus;
import com.covid.data.repository.CovidCasesRepository;
import com.covid.data.repository.StatewiseTestingRepository;
import com.covid.data.repository.VaccineStatusRepository;
import com.covid.data.util.CSVParserHelper;

@Configuration
public class DatabaseInitializer implements ApplicationListener<ApplicationReadyEvent>{

	
	@Autowired
	ResourceLoader resourceLoader;
	
	@Value("${covidCases}")
	String covidCases;
	
	@Value("${vaccine}")
	String vaccine;
	
	@Value("${testing}")
	String testing;
	
	@Autowired
	CovidCasesRepository covidCasesRepository;
	
	@Autowired
	VaccineStatusRepository vaccineStatusRepository;
	
	@Autowired
	StatewiseTestingRepository statewiseTestingRepository;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		
		
		try {
			//Reading covid_19_india.csv
			Resource resource = resourceLoader.getResource("classpath:"+covidCases);
			InputStream inputStream = resource.getInputStream();
			
			//Convert into JAVA Object and Store into DB
			List<CovidCases> covidCaseList = CSVParserHelper.csvToCovidCases(inputStream);
			List<CovidCases> covidRes = covidCasesRepository.saveAll(covidCaseList);
			System.out.println("Total Covid Cases Data saved = "+covidRes.size());
			
			resource = resourceLoader.getResource("classpath:"+vaccine);
			inputStream = resource.getInputStream();
			
			List<VaccineStatus> vaccinationList = CSVParserHelper.csvToVaccineStatus(inputStream);
			List<VaccineStatus> vaccineRes = vaccineStatusRepository.saveAll(vaccinationList);
			System.out.println("Total Vaccine Data saved = "+vaccineRes.size());
			
			resource = resourceLoader.getResource("classpath:"+testing);
			inputStream = resource.getInputStream();
			
			List<StatewiseTest> testingList = CSVParserHelper.csvToStatewiseTesting(inputStream);
			List<StatewiseTest> testingRes = statewiseTestingRepository.saveAll(testingList);
			System.out.println("Total Testing Data saved = "+testingRes.size());
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
