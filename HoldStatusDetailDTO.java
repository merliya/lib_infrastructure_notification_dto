package com.jbhunt.infrastructure.edinotification.shipmentstatus.dto;


import lombok.Data;

@Data
public class HoldStatusDetailDTO {
	
	private String stopTypeCode;
	
	private String stopTypeDescription;
	
	
	private String stopClass;
	
	private String eventType;

}
