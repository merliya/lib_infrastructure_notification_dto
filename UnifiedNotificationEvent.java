package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class UnifiedNotificationEvent {

    private String applicationDomainCode;
    
    private String notificationSubscriptionCategory;
    
    private String notificationSubscriptionSubCategory;
    
    private String notificationSubscriptionType;
    
    private NotificationSubscriptionInAppDTO notificationSubscriptionInAppContent;

	private NotificationSubscriptionMessageDTO notificationSubscriptionMessageContent;
    
    private List<NotificationSubscriptionEmailContent> notificationSubscriptionEmailContents;
    
    private Map<String,List<String>> notificationEventFilters;
    
    private NotificationEventContent notificationEventContent;

}
