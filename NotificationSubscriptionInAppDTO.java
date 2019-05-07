package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class NotificationSubscriptionInAppDTO implements Serializable{

    private static final long serialVersionUID = -7046429093124578052L;

    private String notificationType;
	
	private String notificationContent;
	
	private String plainContent;
	
	private String unsubscribeUrl;
	
	private Integer notificationLogId;

	private Integer userNotificationSubscriptionDetailId;
	
}
