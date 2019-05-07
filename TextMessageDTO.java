package com.jbhunt.infrastructure.notification.message.dto;

import java.util.List;

import lombok.Data;

@Data
public class TextMessageDTO {
	
	private String firstName;

	private String lastName;

	private String trackNumber;

	private String messageBody;
	
	private String postalCode;

	private List<String> phoneNumbers;

	private String link;

	private String status;
	
	private String statusDescription;

	private String smsDeliveryDate;
}
