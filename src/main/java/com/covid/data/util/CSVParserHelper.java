package com.covid.data.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.covid.data.entity.CovidCases;
import com.covid.data.entity.StatewiseTest;
import com.covid.data.entity.VaccineStatus;

public class CSVParserHelper {

	public static List<CovidCases> csvToCovidCases(InputStream is) {
		
		List<CovidCases> covidCaseList = new ArrayList<>();
		
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {



			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				
				String slNo = csvRecord.get(0);
				String date = csvRecord.get(1);
				String time = csvRecord.get(2);
				String stateUT = csvRecord.get(3);
				String confirmIndian = csvRecord.get(4);
				String confirmForeign = csvRecord.get(5);
				String cured = csvRecord.get(6);
				String death = csvRecord.get(7);
				String confirm = csvRecord.get(8);
				
//				System.out.println(slNo+" "+date+" "+time+" "+stateUT+" "+confirmIndian+" "+confirmForeign+" "+cured+" "+death+" "+confirm);
				
				CovidCases covidCase = new CovidCases();
				covidCase.setConfirmDate(date);
				covidCase.setConfirmTime(time);
				covidCase.setStateOrUt(stateUT);
				int indianConfirm = 0;
				try {
					indianConfirm = Integer.parseInt(confirmIndian);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				covidCase.setIndianConfirm(indianConfirm);
				
				int foreignerConfirm = 0;
				try {
					foreignerConfirm = Integer.parseInt(confirmForeign);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				covidCase.setForeignerConfirm(foreignerConfirm);
				
				covidCase.setCured(Integer.parseInt(cured));
				covidCase.setDeaths(Integer.parseInt(death));
				covidCase.setConfirm(Integer.parseInt(confirm));
				
				covidCaseList.add(covidCase);
			}
			
			
		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
		
		return covidCaseList;
	}

	public static List<VaccineStatus> csvToVaccineStatus(InputStream is) {
		// TODO Auto-generated method stub
		List<VaccineStatus> vaccinationList = new ArrayList<>();
		
		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {



			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				
				String vaccineDate = csvRecord.get(0);
				String state = csvRecord.get(1);
				
				int totalDoseAdministered = csvRecord.get(2).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(2));
				int totalSessionConducted = csvRecord.get(3).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(3));
				int totalSite = csvRecord.get(4).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(4));
				int firstDose = csvRecord.get(5).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(5));
				int secondDose = csvRecord.get(6).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(6));
				int male = csvRecord.get(7).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(7));
				int female = csvRecord.get(8).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(8));
				int transgender = csvRecord.get(9).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(9));
				int covaxin = csvRecord.get(10).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(10));
				int covishield = csvRecord.get(11).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(11));
				int sputnikV = csvRecord.get(12).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(12));
				int aefi = csvRecord.get(13).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(13));
				int _18_45 = csvRecord.get(14).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(14));
				int _45_60 = csvRecord.get(15).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(15));
				int _60Plus = csvRecord.get(16).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(16));
				int totalVaccinated = csvRecord.get(17).length()==0 ? 0 : (int) Float.parseFloat(csvRecord.get(17));
				
				
				VaccineStatus vaccineStatus = new VaccineStatus();
				vaccineStatus.setAefi(aefi);
				vaccineStatus.setFirstDoseAdministered(firstDose);
				vaccineStatus.setSecondDoseAdministered(secondDose);
				vaccineStatus.setState(state);
				vaccineStatus.setTotal18To45Years(_18_45);
				vaccineStatus.setTotal45To6Years(_45_60);
				vaccineStatus.setTotal60PlusYears(_60Plus);
				vaccineStatus.setTotalCovaxinAdministered(covaxin);
				vaccineStatus.setTotalCoviShieldAdministered(covishield);
				vaccineStatus.setTotalDoseAdministered(totalDoseAdministered);
				vaccineStatus.setTotalFemaleVaccinated(female);
				vaccineStatus.setTotalIndividualVaccinated(totalVaccinated);
				vaccineStatus.setTotalMaleVaccinated(male);
				vaccineStatus.setTotalSessionConducted(totalSessionConducted);
				vaccineStatus.setTotalSite(totalSite);
				vaccineStatus.setTotalTransgenderVaccinated(transgender);
				vaccineStatus.setTotalSputnikVAdministered(sputnikV);
				vaccineStatus.setVaccinationDate(DateTimeUtil.convertDate(vaccineDate, "dd/MM/yyyy", "yyyy-MM-dd"));
				
				
			
				vaccinationList.add(vaccineStatus);
				
				
			}
		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
		return vaccinationList;
	}
	
	
	public static List<StatewiseTest> csvToStatewiseTesting(InputStream is) {

		List<StatewiseTest> testingList = new ArrayList<StatewiseTest>();

		try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				CSVParser csvParser = new CSVParser(fileReader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {



			Iterable<CSVRecord> csvRecords = csvParser.getRecords();

			for (CSVRecord csvRecord : csvRecords) {
				
				String negStr = csvRecord.get(3);
				String posStr = csvRecord.get(4);
				String totStr = csvRecord.get(2);
				
				negStr = negStr.length()==0 ? "0.0" : negStr;
				posStr = posStr.length()==0 ? "0.0" : posStr;
				totStr = totStr.length()==0 ? "0.0" : totStr;
				
				float neg = Float.parseFloat(negStr);
				float pos = Float.parseFloat(posStr);
				float tot = Float.parseFloat(totStr);
				StatewiseTest test = new StatewiseTest();
				test.setTestingDate(csvRecord.get(0));
				test.setNegative((int) neg);
				test.setPositive((int) pos);
				test.setState(csvRecord.get(1));
				test.setTotalSamples((int) tot);

				testingList.add(test);
			}
		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
		
		return testingList;

	}
	
	
	
	
}
