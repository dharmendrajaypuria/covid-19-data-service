package com.covid.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VaccineStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String vaccinationDate;
	private String state;
	
	private int totalDoseAdministered;
	private int totalSessionConducted;
	private int totalSite;
	private int firstDoseAdministered;
	private int secondDoseAdministered;
	
	private int totalMaleVaccinated;
	private int totalFemaleVaccinated;
	private int totalTransgenderVaccinated;
	
	private int totalCovaxinAdministered;
	private int totalCoviShieldAdministered;
	private int totalSputnikVAdministered;
	
	private int aefi;
	
	private int total18To45Years;
	private int total45To6Years;
	private int total60PlusYears;
	
	private int totalIndividualVaccinated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVaccinationDate() {
		return vaccinationDate;
	}

	public void setVaccinationDate(String vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getTotalDoseAdministered() {
		return totalDoseAdministered;
	}

	public void setTotalDoseAdministered(int totalDoseAdministered) {
		this.totalDoseAdministered = totalDoseAdministered;
	}

	public int getTotalSessionConducted() {
		return totalSessionConducted;
	}

	public void setTotalSessionConducted(int totalSessionConducted) {
		this.totalSessionConducted = totalSessionConducted;
	}

	public int getTotalSite() {
		return totalSite;
	}

	public void setTotalSite(int totalSite) {
		this.totalSite = totalSite;
	}

	public int getFirstDoseAdministered() {
		return firstDoseAdministered;
	}

	public void setFirstDoseAdministered(int firstDoseAdministered) {
		this.firstDoseAdministered = firstDoseAdministered;
	}

	public int getSecondDoseAdministered() {
		return secondDoseAdministered;
	}

	public void setSecondDoseAdministered(int secondDoseAdministered) {
		this.secondDoseAdministered = secondDoseAdministered;
	}

	public int getTotalMaleVaccinated() {
		return totalMaleVaccinated;
	}

	public void setTotalMaleVaccinated(int totalMaleVaccinated) {
		this.totalMaleVaccinated = totalMaleVaccinated;
	}

	public int getTotalFemaleVaccinated() {
		return totalFemaleVaccinated;
	}

	public void setTotalFemaleVaccinated(int totalFemaleVaccinated) {
		this.totalFemaleVaccinated = totalFemaleVaccinated;
	}

	public int getTotalTransgenderVaccinated() {
		return totalTransgenderVaccinated;
	}

	public void setTotalTransgenderVaccinated(int totalTransgenderVaccinated) {
		this.totalTransgenderVaccinated = totalTransgenderVaccinated;
	}

	public int getTotalCovaxinAdministered() {
		return totalCovaxinAdministered;
	}

	public void setTotalCovaxinAdministered(int totalCovaxinAdministered) {
		this.totalCovaxinAdministered = totalCovaxinAdministered;
	}

	public int getTotalCoviShieldAdministered() {
		return totalCoviShieldAdministered;
	}

	public void setTotalCoviShieldAdministered(int totalCoviShieldAdministered) {
		this.totalCoviShieldAdministered = totalCoviShieldAdministered;
	}

	public int getTotalSputnikVAdministered() {
		return totalSputnikVAdministered;
	}

	public void setTotalSputnikVAdministered(int totalSputnikVAdministered) {
		this.totalSputnikVAdministered = totalSputnikVAdministered;
	}

	public int getAefi() {
		return aefi;
	}

	public void setAefi(int aefi) {
		this.aefi = aefi;
	}

	public int getTotal18To45Years() {
		return total18To45Years;
	}

	public void setTotal18To45Years(int total18To45Years) {
		this.total18To45Years = total18To45Years;
	}

	public int getTotal45To6Years() {
		return total45To6Years;
	}

	public void setTotal45To6Years(int total45To6Years) {
		this.total45To6Years = total45To6Years;
	}

	public int getTotal60PlusYears() {
		return total60PlusYears;
	}

	public void setTotal60PlusYears(int total60PlusYears) {
		this.total60PlusYears = total60PlusYears;
	}

	public int getTotalIndividualVaccinated() {
		return totalIndividualVaccinated;
	}

	public void setTotalIndividualVaccinated(int totalIndividualVaccinated) {
		this.totalIndividualVaccinated = totalIndividualVaccinated;
	}
	
	
	
}
