package com.jbhunt.infrastructure.edinotification.subscription.dto;

import java.util.List;

import lombok.Data;

@Data
public class EDINotificationResendDTO {
	
	
	private String orderNumber;
	
	private String shipmentID;
	
	private String tradingPartner;
	
	private String eventSubType;
	
	private int notificationLogId;
	
	private String processedDateTime;
	
	private List<EDIReference> ediReference;
	
	private int ucrstcontrolNumber;
	
	private int ucrisacontrolNumber;
	
	private int ucrgscontrolNumber;
	


}
