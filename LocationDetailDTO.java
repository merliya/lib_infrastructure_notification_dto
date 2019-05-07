package com.jbhunt.infrastructure.edinotification.shipmentstatus.dto;

import lombok.Data;

@Data
public class LocationDetailDTO {
	private Integer id;
	private String name;
	private String code;
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String detail;
	

}
