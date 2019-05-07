package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import lombok.Data;

@Data
public class NotificationEventContent {
	
	private String orderDetailsContent;
    
    private String loadDetailsContent;
    
    private String unifiedCustomerRequestContent;
    
    private String commitmentDetailsContent;
    
    private String checkCallContent;
    
    private String ediContent;
    
    private String orderMonitorContent;

}
