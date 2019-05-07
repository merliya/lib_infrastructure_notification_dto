package com.jbhunt.infrastructure.notification.message.dto;

import com.jbhunt.infrastructure.notification.unifiedschema.dto.NotificationDeliveryChannel;

import lombok.Data;

@Data
public class NotificationLogDTO {

	private String applicationDomainCode;
	
	private String userId;
	
	private NotificationDeliveryChannel notificationDeliveryChannel;
	
	private String notificationContent;
	
}
