package com.covid.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.data.entity.CovidCases;

public interface CovidCasesRepository extends JpaRepository<CovidCases, Integer> {

	@Query("SELECT C FROM CovidCases C WHERE C.confirmDate=:date")
	List<CovidCases> findByConfirmDate(String date);
	
	@Query("SELECT C FROM CovidCases C WHERE C.stateOrUt=:state")
	List<CovidCases> findByState(String state);
	
	@Query("SELECT C FROM CovidCases C WHERE C.stateOrUt=:state and C.confirmDate=:date")
	List<CovidCases> findByStateAndDate(@Param("state") String state, @Param("date") String date);
}
