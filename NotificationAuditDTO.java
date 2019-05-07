package com.jbhunt.infrastructure.usernotification.subscription.dto;

import lombok.Data;

@Data
public class NotificationAuditDTO {

	private Integer id;
	
	private String content;
	
	private String type;
	
	private String reason;
	
}
