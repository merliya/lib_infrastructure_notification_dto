package com.jbhunt.infrastructure.notification.exacttarget.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResponseDTO {

	private String recipientSendId;
	
	private boolean hasErrors;
	
	private List<String> messages;
	
}
