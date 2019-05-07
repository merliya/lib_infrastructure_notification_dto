package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class NotificationSubscriptionMessageDTO implements Serializable{

    private static final long serialVersionUID = -3436975377624759415L;

    private String notificationContent;
	
	private String link;
	
}
