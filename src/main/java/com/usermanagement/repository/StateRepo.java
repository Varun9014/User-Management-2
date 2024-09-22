package com.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usermanagement.entity.Country;
import com.usermanagement.entity.State;


@Repository
public interface StateRepo extends JpaRepository<State, Integer>{

	public String getState(State s,Country c);
	
}
