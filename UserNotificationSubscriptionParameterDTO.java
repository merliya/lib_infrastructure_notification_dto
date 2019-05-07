package com.jbhunt.infrastructure.usernotification.subscription.dto;

import java.util.Map;

import lombok.Data;

@Data
public class UserNotificationSubscriptionParameterDTO {

	private String id;
	
	private Map<String, String> details;
		
}
