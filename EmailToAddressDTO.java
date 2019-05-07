package com.jbhunt.infrastructure.notification.exacttarget.dto;

import lombok.Data;

@Data
public class EmailToAddressDTO {

	private String address;
	
	private String subscriberKey;
	
	private ContactAttributesDTO contactAttributes;
	
}
