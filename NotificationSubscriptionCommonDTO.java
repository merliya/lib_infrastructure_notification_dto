package com.jbhunt.infrastructure.edinotification.common.dto;

import java.util.List;

import lombok.Data;
@Data
public abstract class NotificationSubscriptionCommonDTO extends NotificationSubscriptionAuditDTO{

    protected String status;
        
    protected List<String> subscriptionEvents;
    
    protected Short timeDelayFrequency;
    
    
}
