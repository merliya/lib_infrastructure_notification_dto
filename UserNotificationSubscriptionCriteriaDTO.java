package com.jbhunt.infrastructure.usernotification.subscription.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserNotificationSubscriptionCriteriaDTO {
	
	private String userNotificationSubscriptionParameterCode;
	
	private List<UserNotificationSubscriptionParameterDTO> userNotificationSubscriptionParameterValues;

}
