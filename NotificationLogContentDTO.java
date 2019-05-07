package com.jbhunt.infrastructure.usernotification.subscription.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRawValue;

import lombok.Data;

@Data
public class NotificationLogContentDTO {
    
	
	private List<NotificationLogRawContentDTO> notificationRawData;

}
