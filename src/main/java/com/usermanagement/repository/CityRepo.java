package com.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usermanagement.entity.City;


@Repository
public interface CityRepo extends JpaRepository<City, Integer>{

	
	
}
