package com.jbhunt.infrastructure.notification.exacttarget.dto;

import lombok.Data;

@Data
public class ETRequestDTO {

	private EmailFromAddressDTO from;
	
	private EmailToAddressDTO to;
	
	private ETOptionsDTO options;
	
	private String templateId;
	
}
