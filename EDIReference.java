package com.jbhunt.infrastructure.edinotification.subscription.dto;

import lombok.Data;

@Data
public class EDIReference {
	
	private String stopNumber;
	
	private String referenceType;
	
	private String rampCode;
	
	private String referenceValue;
	
	private String errorMessage;
	

}
