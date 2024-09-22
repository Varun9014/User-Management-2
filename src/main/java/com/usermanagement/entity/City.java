package com.usermanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table
@Entity(name="state-tbl")
public class City
{

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityId;
	
	
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name="stateId")
	private Country country;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	


}

