package com.covid.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CovidCases {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String confirmDate;
	private String confirmTime;
	private String stateOrUt;
	private int indianConfirm;
	private int foreignerConfirm;
	private int cured;
	private int deaths;
	private int confirm;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConfirmDate() {
		return confirmDate;
	}
	public void setConfirmDate(String confirmDate) {
		this.confirmDate = confirmDate;
	}
	public String getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}
	public String getStateOrUt() {
		return stateOrUt;
	}
	public void setStateOrUt(String stateOrUt) {
		this.stateOrUt = stateOrUt;
	}
	public int getIndianConfirm() {
		return indianConfirm;
	}
	public void setIndianConfirm(int indianConfirm) {
		this.indianConfirm = indianConfirm;
	}
	public int getForeignerConfirm() {
		return foreignerConfirm;
	}
	public void setForeignerConfirm(int foreignerConfirm) {
		this.foreignerConfirm = foreignerConfirm;
	}
	public int getCured() {
		return cured;
	}
	public void setCured(int cured) {
		this.cured = cured;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public int getConfirm() {
		return confirm;
	}
	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}
	
	
	
}
