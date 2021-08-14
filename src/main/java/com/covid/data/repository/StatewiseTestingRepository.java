package com.covid.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.data.entity.StatewiseTest;

public interface StatewiseTestingRepository extends JpaRepository<StatewiseTest, Integer> {

	@Query("SELECT ST FROM StatewiseTest ST WHERE ST.testingDate=:date")
	List<StatewiseTest> findByTestingDate(String date);
	
	@Query("SELECT ST FROM StatewiseTest ST WHERE ST.state=:state")
	List<StatewiseTest> findByState(String state);
	
	@Query("SELECT ST FROM StatewiseTest ST WHERE ST.testingDate=:date and ST.state=:state")
	List<StatewiseTest> findByStateAndDate(@Param("state") String state, @Param("date") String date);
	
//	@Query("SELECT ST FROM StatewiseTest ST WHERE ST.testingDate=:date and ST.state IN (:state)")
//	List<StatewiseTest> findByMultiStateAndDate(@Param("states") String states, @Param("date") String date);
}
