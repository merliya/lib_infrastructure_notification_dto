package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class NotificationSubscriptionEmailContent implements Serializable{

	    private static final long serialVersionUID = 7087909374104472887L;

    private String templateId;
	
	private RecipientType recipientType;
	
	private Map<String, Object> dynamicContents;
}
