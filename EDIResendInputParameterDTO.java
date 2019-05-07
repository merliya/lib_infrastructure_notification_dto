package com.jbhunt.infrastructure.edinotification.subscription.dto;

import java.util.List;

import lombok.Data;

@Data
public class EDIResendInputParameterDTO {
	
	List<String> tradingPartnerId;
	
	List<String> transactionType;
	
	List<String> status;
	
	String from;
	
	String to;
	
	String orderNumber;
	
	List<String> stop;
	
	List<String> referenceNumber;
	

}
