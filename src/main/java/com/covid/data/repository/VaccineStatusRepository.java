package com.covid.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.data.entity.VaccineStatus;

public interface VaccineStatusRepository extends JpaRepository<VaccineStatus, Integer> {

	@Query("SELECT VS FROM VaccineStatus VS WHERE VS.vaccinationDate=:date")
	List<VaccineStatus> findByVaccineDate(String date);
	
	@Query("SELECT VS FROM VaccineStatus VS WHERE VS.state=:state")
	List<VaccineStatus> findByState(String state);
	
	@Query("SELECT VS FROM VaccineStatus VS WHERE VS.state=:state and VS.vaccinationDate=:date")
	List<VaccineStatus> findByStateAndDate(@Param("state") String state, @Param("date") String date);
}
