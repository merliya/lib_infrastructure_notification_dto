package com.jbhunt.infrastructure.notification.exacttarget.dto;

import java.util.Map;

import lombok.Data;

@Data
public class ETDeliveryRecordDTO {

	private String deliveryTime;
	
	private String id;
	
	private String messageId;
	
	private String status;
	
	private Map<String, String> to;
	
}
